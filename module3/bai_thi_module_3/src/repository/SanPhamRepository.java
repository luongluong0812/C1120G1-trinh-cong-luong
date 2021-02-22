package repository;

import bean.SanPham;

import javax.lang.model.element.PackageElement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SanPhamRepository implements ISanPhamRepository {
    private BaseRepository baseRepository = new BaseRepository();
    String sql_find_all = "select * from san_pham;";
    String sql_add = "insert into san_pham (id_san_pham,ten_san_pham,gia_san_pham,muc_giam_gia,ton_kho) values (?,?,?,?,?);";

    @Override
    public List<SanPham> finAll() {
        List<SanPham> list = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement(sql_find_all);
            ResultSet resultSet = preparedStatement.executeQuery();
            SanPham sanPham = null;
            while (resultSet.next()) {
                int id = Integer.parseInt(resultSet.getString("id_san_pham"));
                String name = resultSet.getString("ten_san_pham");
                int gia = Integer.parseInt(resultSet.getString("gia_san_pham"));
                int muc_giam_gia = Integer.parseInt(resultSet.getString("muc_giam_gia"));
                int ton_kho = Integer.parseInt(resultSet.getString("ton_kho"));
                sanPham = new SanPham(id, name, gia, muc_giam_gia, ton_kho);
                list.add(sanPham);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public void create(SanPham sanPham) throws SQLException {
        PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement(sql_add);
        preparedStatement.setInt(1, sanPham.getIdSanPham());
        preparedStatement.setString(2, sanPham.getTenSanPham());
        preparedStatement.setInt(3, (sanPham.getGiaSanPham()));
        preparedStatement.setInt(4, (sanPham.getMucGiamGia()));
        preparedStatement.setInt(5, (sanPham.getTonKho()));
        int result = preparedStatement.executeUpdate();
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
