package com.qa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Cafe {

	Statement stmt = null;
	Connection conn = null;

	JdbcDemo db = new JdbcDemo();

	public Drinks addDrink(Drinks drink) {
		try {
			String query = "INSERT INTO drinks(type, size, dairyFree, cost) VALUES (?, ?, ?, ?);";
			PreparedStatement prestmt = conn.prepareStatement(query);
			prestmt.setString(1, drink.getType());
			prestmt.setString(2, drink.getSize());
			prestmt.setBoolean(3, drink.isDairyFree());
			prestmt.setFloat(4, drink.getCost());
			prestmt.executeUpdate();
			return readLatest();
//			conn = db.connect();
//			stmt = conn.createStatement();
//			String queryOLD = "INSERT INTO drinks(type, size, dairyFree, cost) VALUES('latte', 'grande', false, 3.39);";
//			String query = "INSERT INTO drinks(type, size, dairyFree, cost) VALUES('"+ drink.getType() + "', '"+ drink.getSize() +"', " + drink.isDairyFree()+ ", "+ drink.getCost()+");";
//			System.out.println(query);
//			stmt.executeUpdate(query);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public Drinks readLatest() {
		try {
			String query = "SELECT * FROM drinks ORDER BY id DESC LIMIT 1;";
			PreparedStatement preStmt = conn.prepareStatement(query);
			ResultSet results = preStmt.executeQuery();
			return modelDrink(results);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public Drinks getDrinkById(int id) {
		try {
			String query = "SELECT * FROM drinks WHERE id = ?;";
			PreparedStatement preStmt = conn.prepareStatement(query);
			preStmt.setInt(1, id);
			ResultSet results = preStmt.executeQuery();
			return modelDrink(results);
//			conn = db.connect();
//			stmt = conn.createStatement();
//			String query = "SELECT * FROM drinks WHERE id = " + id;
//			ResultSet results = stmt.executeQuery(query);
//			results.next();
//			Drinks drinkresult = modelDrink(results);
//			return drinkresult;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public boolean deleteDrinkById(int id) {
		try {
//			conn = db.connect();
			String query = "DELETE FROM drinks WHERE id = ?";
			PreparedStatement prestmt = conn.prepareStatement(query);
			prestmt.setInt(1, id);
			prestmt.executeUpdate();
			return true;

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}


	public Drinks updateDrinkById(int id, Drinks drink) {
		try {
//			conn = db.connect();
			String query = "UPDATE drinks SET type = ?, size = ?, dairyFree = ?, cost = ? WHERE id =? ";
			PreparedStatement prestmt = conn.prepareStatement(query);
			prestmt.setString(1, drink.getType());
			prestmt.setString(2, drink.getSize());
			prestmt.setBoolean(3, drink.isDairyFree());
			prestmt.setFloat(4, drink.getCost());
			prestmt.setInt(5, id);
			prestmt.executeUpdate();
			return getDrinkById(id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
//	public ArrayList<Drinks> getAllDrinks() {
//		ArrayList<Drinks> resultList = new ArrayList<>();
//		try {
//			conn = db.connect();
//			stmt = conn.createStatement();
//			String query = "SELECT * FROM drinks";
//			ResultSet results = stmt.executeQuery(query);
//
//			while (results.next()) {
//				resultList.add(modelDrink(results));
//			}
//			return resultList;
//		} catch (Exception e) {
//			e.printStackTrace();
//			return null;
//		}
//	}

	public Drinks modelDrink(ResultSet result) {
		try {
			result.next();
			int id = result.getInt(1);
			String type = result.getString("type");
			String size = result.getString("size");
			Boolean bool = result.getBoolean("dairyFree");
			float cost = result.getFloat("cost");

			Drinks drink = new Drinks(id, type, size, bool, cost);
			return drink;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

//	public ArrayList<Drinks> getDrinkByQuery(String queryTerm, String value) {
//		ArrayList<Drinks> resultList = new ArrayList<>();
//		try {
//			conn = db.connect();
//			stmt = conn.createStatement();
//			String query = "SELECT * FROM drinks WHERE " + queryTerm + " = " + value;
//			System.out.println(query);
//			ResultSet results = stmt.executeQuery(query);
//
//			while (results.next()) {
//				resultList.add(modelDrink(results));
//			}
//			return resultList;
//		} catch (Exception e) {
//			e.printStackTrace();
//			return null;
//		}
//	}
//


}
