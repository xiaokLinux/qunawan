package com.qunawan.ServiceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.qunawan.Dao.ThemeDao;
import com.qunawan.Service.ThemeService;
import com.qunawan.entity.Theme;
@Service
@Transactional(propagation=Propagation.REQUIRED)
public class ThemeServiceImp implements ThemeService {
	@Autowired
	private ThemeDao themeDao;

	@Override
	public List<Theme> getHotThemesByType(int type) {
		// TODO Auto-generated method stub
		return themeDao.getHotThemesByType(type);
	}
	
}
