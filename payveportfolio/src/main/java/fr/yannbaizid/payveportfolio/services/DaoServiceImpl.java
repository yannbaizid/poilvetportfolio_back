package fr.yannbaizid.payveportfolio.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.yannbaizid.payveportfolio.bo.Image;
import fr.yannbaizid.payveportfolio.dao.ImageDao;

@Service
public class DaoServiceImpl implements ImageService {

	@Autowired
	private ImageDao imageDao;
	
	@Override
	public Optional<Image> findById(Integer id) {
		return imageDao.findById(id);
	}

	@Override
	public List<Image> findAll() {
		return (List<Image>)imageDao.findAll();
	}

	@Override
	public Image save(Image image) {
		return imageDao.save(image);
	}

	@Override
	public void deleteById(Integer id) {
		imageDao.deleteById(id);

	}

}
