package io.kbdhunters.menu.mapper;

import io.kbdhunters.common.dto.TreeDTO;
import io.kbdhunters.menu.dto.MenuConditionDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Jason, Moon
 * @since 2018-05-12.
 */
@Mapper
@Repository
public interface MenuMapper {

    List<TreeDTO> getTreeList(MenuConditionDTO menuConditionDTO);
}
