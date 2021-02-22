package service;

import bean.SanPham;
import repository.ISanPhamRepository;
import repository.SanPhamRepository;

import java.sql.SQLException;
import java.util.List;

public class SanPhamService implements ISanPhamService {
    private ISanPhamRepository sanPhamRepository=new SanPhamRepository();

    @Override
    public List<SanPham> finAll() {
        return sanPhamRepository.finAll();
    }

    @Override
    public void create(SanPham sanPham) throws SQLException {
sanPhamRepository.create(sanPham);
    }

    @Override
    public List<SanPham> findMore(int number) {
        return null;
    }

    @Override
    public List<SanPham> findByDate(String date, String date2) {
        return null;
    }
}
