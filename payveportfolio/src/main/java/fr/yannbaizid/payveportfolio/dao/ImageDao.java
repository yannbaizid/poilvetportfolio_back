package fr.yannbaizid.payveportfolio.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.yannbaizid.payveportfolio.bo.Image;

@Repository
public interface ImageDao extends CrudRepository<Image, Integer> {

}
