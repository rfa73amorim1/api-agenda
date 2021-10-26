package br.com.rfa73amorim1.agenda.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//usou uma anotação para dispensar a classe controller para gerar as apis de acesso rest à aplicação
//a anotação não é obrigatória, pos foi injetada a dependência: spring-boot-starter-data-rest
//ou seja..isso aqui já faz o CRUD...
@RepositoryRestResource (collectionResourceRel = "contatos", path = "contatos")
public interface ContatoRepository extends JpaRepository <ContatoEntity, Long> {



}
