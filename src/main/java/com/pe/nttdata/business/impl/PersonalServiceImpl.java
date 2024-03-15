package com.pe.nttdata.business.impl;

import com.pe.nttdata.business.PersonalService;
import com.pe.nttdata.dao.PersonalDao;
import com.pe.nttdata.model.entity.Personal;
import java.util.Optional;
import lombok.extern.slf4j.Slf4j;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 *<b>Class</b>: {@link PersonalServiceImpl}<br/>
 *<b>Copyright</b>: &Copy; 2024 NTTDATA Per&uacute;. <br/>
 *<b>Company</b>: NTTDATA del Per&uacute;. <br/>
 *
 *@author NTTDATA Per&uacute;. (EVE) <br/>
 *<u>Developed by</u>: <br/>
 *<ul>
 *<li>Hugo Oliveros Monti</li>
 *</ul>
 *<u>Changes</u>:<br/>
 *<ul>
 *<li>feb. 29, 2024 (acronym) Creation class.</li>
 *</ul>
 *@version 1.0
 */
@Service
@Slf4j
public class PersonalServiceImpl implements PersonalService {

  @Autowired
  private PersonalDao personalDao;

  @Override
  public Flux<Personal> findAll() {
    return personalDao.findAll();
  }

  @Override
  public Mono<Personal> findById(String id) {
    return personalDao.findById(id);
  }

  @Override
  public Mono<Personal> save(Personal persona) {
    return personalDao.save(persona);
  }

  /**
   * <p/>
   * Flux all elements from Mongo passing for
   * reactivate Flux passing the id as a parameter.
   *
   * @param id {@link String}
   * @param persona {@link Personal}
   * @return {@link Mono}&lt;{@link Personal}&gt;
   * @see String
   * @see Mono
   */
  @Override
  public  Mono<Personal> update(final String id, final Personal persona) {
    return personalDao.findById(id)
            .map(Optional::of)
            .defaultIfEmpty(Optional.empty())
            .flatMap(optional -> {
              if (optional.isPresent()) {
                persona.setId(new ObjectId(id));
                return personalDao.save(persona);
              }
              return Mono.empty();
            });
  }

  @Override
  public Mono<Void> deleteById(String id) {
    return personalDao.deleteById(id);
  }

}
