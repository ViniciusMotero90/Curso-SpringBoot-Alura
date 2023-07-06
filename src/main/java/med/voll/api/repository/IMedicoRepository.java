package med.voll.api.repository;

import jakarta.validation.constraints.NotNull;
import med.voll.api.model.Medico;
import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IMedicoRepository extends JpaRepository<Medico, Long> {
    Medico atualizarInformacoes(@NotNull long dados);

    Page<Medico> findAllByAtivoTrue(Pageable paginacao);
}
