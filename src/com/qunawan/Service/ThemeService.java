package com.qunawan.Service;

import java.util.List;

import com.qunawan.entity.Theme;

public interface ThemeService {
	public List<Theme> getHotThemesByType(int type);
}
