package com.api.bbmnet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.bbmnet.entity.SistemaEntity;
import com.api.bbmnet.form.SistemaForm;
import com.api.bbmnet.repository.SistemaRepository;

@Service
public class SistemaService {

	@Autowired
	private SistemaRepository sistemaRepository;
	
	public List<SistemaEntity> findAllSistemas(){
		
		return sistemaRepository.findAll();
		
	}
	
	public SistemaEntity saveSistema(SistemaForm sistemaForm) {
		
		SistemaEntity sistemaEntity = new SistemaEntity();
		sistemaEntity.setNome(sistemaForm.getNome());
		
		return sistemaRepository.save(sistemaEntity);
		
	}
	
	public void deletaSistemaById(long id) {
		
		sistemaRepository.deleteById(id);
		
	}
	
}
