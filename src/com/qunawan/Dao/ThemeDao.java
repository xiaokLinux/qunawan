package com.qunawan.Dao;

import java.util.List;

import com.qunawan.entity.Theme;

public interface ThemeDao {
	public List<Theme> getHotThemesByType(int type);
}
