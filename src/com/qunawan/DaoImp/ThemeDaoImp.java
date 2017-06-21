package com.qunawan.DaoImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.qunawan.Dao.ThemeDao;
import com.qunawan.entity.Theme;
@Repository
public class ThemeDaoImp implements ThemeDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;
	@Override
	public List<Theme> getHotThemesByType(int type) {
		// TODO Auto-generated method stub
		return (List<Theme>) hibernateTemplate.find("SELECT DISTINCT t FROM Themeontrip tt LEFT JOIN tt.theme t LEFT JOIN tt.trip tp " + "WHERE tp.sequence = " + type);
	}

}
