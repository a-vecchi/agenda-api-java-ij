package io.gtihub.course.alex.agendaapi.model.repository;

import io.gtihub.course.alex.agendaapi.model.entity.Contato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContatoRepository extends JpaRepository<Contato, Integer> {
}
