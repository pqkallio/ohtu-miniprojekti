/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniproju.repositories;

import miniproju.models.Reference;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;



/**
 *
 * @author ilkka
 */
@Repository
public interface ReferenceRepository extends JpaRepository<Reference, Long> {
    
    public boolean existsByEntryKey(String entryKey);
    
}
