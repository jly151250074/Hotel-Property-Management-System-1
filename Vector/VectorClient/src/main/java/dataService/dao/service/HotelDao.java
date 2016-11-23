package dataService.dao.service;

import po.HotelPo;

import java.util.List;

/**
 * @ author Molloh
 * @ version 2016/11/6
 * @ description
 */
public interface HotelDao {
    List<HotelPo> keyFind(String key);
}
