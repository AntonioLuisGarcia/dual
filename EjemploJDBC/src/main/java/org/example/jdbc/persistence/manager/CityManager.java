package org.example.jdbc.persistence.manager;

import org.example.jdbc.persistence.connector.MySQLConnector;
import org.example.jdbc.persistence.manager.dao.City;

import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CityManager {

    public List<City> findAll(Connection con){
        try(Statement sta = con.createStatement()){
           ResultSet result = sta.executeQuery("SELECT * FROM city");

           result.beforeFirst();

           List<City> cities = new ArrayList<>();

            while (result.next()) {
                cities.add(new City(result));
            }

            return cities;
        }catch (SQLException e){
            e.printStackTrace();
            return null;
        }
    }

    public List<City> findById(Connection con, int id){

        try(PreparedStatement stm = con.prepareStatement("SELECT * FROM City WHERE ID = ?")){

            stm.setInt(1, id);

            ResultSet result = stm.executeQuery();

            result.beforeFirst();

            List<City> cities = new ArrayList<>();

            while(result.next()){
                cities.add(new City(result));
            }

            return cities;

        }catch(SQLException e){
            e.printStackTrace();
            return null;
        }

    }

    public List<City> findByNAmeAndCountryCode(Connection con, String name, String countryCode){

        try(PreparedStatement stm = con.prepareStatement("SELECT * FROM City WHERE name like ? AND CountryCode = ?")){

            stm.setString(1, "%" + name + "%");
            stm.setString(2,countryCode);

            ResultSet result = stm.executeQuery();

            result.beforeFirst();

            List<City> cities = new ArrayList<>();

            while(result.next()){
                cities.add(new City(result));
            }

            return cities;

        }catch(SQLException e){
            e.printStackTrace();
            return null;
        }

    }

    public int save(Connection con, City city){

        try(PreparedStatement stm = con.prepareStatement("INSERT INTO city (name, countryCode, district, population, )values(?,?,?,?)")){

            stm.setString(1,city.getName());
            stm.setString(2,city.getCountryCode());
            stm.setString(3,city.getDistrict());
            stm.setBigDecimal(4,city.getPopulation());

            stm.executeUpdate();

            ResultSet result = stm.getGeneratedKeys();

            int generateId = 0;

            while(result.next()){
                generateId = result.getInt(1);
            }

            return generateId;

        }catch(SQLException e){
            e.printStackTrace();
            return 0;
        }

    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException{

        Connection con = new MySQLConnector().getMySQLConection();

        City city = new City();

        city.setName("Ablana");
        city.setDistrict("Andalusia");
        city.setPopulation(BigDecimal.valueOf(456));
        city.setCountryCode("ESP");

        int id = new CityManager().save(con,city);

        City cityResults = (City) new CityManager().findById(con, id);

        System.out.println(cityResults);

        con.close();
    }
}
