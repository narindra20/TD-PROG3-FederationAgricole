package hei.school.agricole.repository;

import hei.school.agricole.dto.CollectiviteDTO;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class CollectiviteRepository {

    private final Connection connection;

    public CollectiviteRepository(Connection connection) {
        this.connection = connection;
    }

    // CREATE
    public void save(CollectiviteDTO dto) {
        String sql = """
            INSERT INTO collectivite (nom, numero, date_creation, id_ville, id_domaine, id_federation)
            VALUES (?, ?, ?, ?, ?, ?)
        """;

        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, dto.getNom());
            ps.setInt(2, dto.getNumero());
            ps.setDate(3, Date.valueOf(dto.getDateCreation()));
            ps.setInt(4, dto.getIdVille());
            ps.setInt(5, dto.getIdDomaine());
            ps.setInt(6, dto.getIdFederation());

            ps.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    // READ ALL
    public List<CollectiviteDTO> findAll() {
        String sql = "SELECT * FROM collectivite";
        List<CollectiviteDTO> list = new ArrayList<>();

        try (Statement st = connection.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                list.add(map(rs));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return list;
    }

    // READ BY ID
    public Optional<CollectiviteDTO> findById(int id) {
        String sql = "SELECT * FROM collectivite WHERE id_collectivite = ?";

        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return Optional.of(map(rs));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return Optional.empty();
    }

    // READ BY NOM
    public Optional<CollectiviteDTO> findByNom(String nom) {
        String sql = "SELECT * FROM collectivite WHERE nom = ?";

        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, nom);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return Optional.of(map(rs));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return Optional.empty();
    }

    // helper mapping
    private CollectiviteDTO map(ResultSet rs) throws SQLException {
        CollectiviteDTO dto = new CollectiviteDTO();

        dto.setId(rs.getInt("id_collectivite"));
        dto.setNom(rs.getString("nom"));
        dto.setNumero(rs.getInt("numero"));
        dto.setDateCreation(rs.getDate("date_creation").toLocalDate());
        dto.setIdVille(rs.getInt("id_ville"));
        dto.setIdDomaine(rs.getInt("id_domaine"));
        dto.setIdFederation(rs.getInt("id_federation"));

        return dto;
    }
}