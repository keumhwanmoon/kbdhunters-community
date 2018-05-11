package io.kbdhunters.menu.service;

import io.kbdhunters.common.dto.TreeDTO;
import io.kbdhunters.menu.dto.MenuConditionDTO;
import io.kbdhunters.menu.mapper.MenuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Jason, Moon
 * @since 2018-05-12.
 */
@Service
public class MenuService {

    private final MenuMapper menuMapper;

    @Autowired
    public MenuService(MenuMapper menuMapper) {
        this.menuMapper = menuMapper;
    }

    public List<TreeDTO> getTreeList(MenuConditionDTO menuConditionDTO) {
        return menuMapper.getTreeList(menuConditionDTO);
    }
}
