package service;

import bean.SanPham;

import java.sql.SQLException;
import java.util.List;

public interface ISanPhamService {
    List<SanPham> finAll();
    void create(SanPham sanPham) throws SQLException;
    List<SanPham> findMore( int number);
    List<SanPham> findByDate(String date,String date2);
}
