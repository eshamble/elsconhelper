package com.perscholas.conhelper.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;
import com.perscholas.conhelper.model.*;
@Repository
public interface DesignRepository extends JpaRepository<Design, Long>{

}
