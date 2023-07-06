package aps;

import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3307/aps";
		String user = "root";
		String pass = "mysql";
		String sql = "";
		String resp = "";
		Scanner sc1 = null;
		Scanner sc2 = null;
		Connection conn = null;
		Statement stmt = null;
		ResultSet rset = null;

		try {
			conn = DriverManager.getConnection(url, user, pass);
			if (conn != null) {

				sc1 = new Scanner(System.in);
				System.out.println("1 - relatorio de uma cidade");
				System.out.println("2 - relatorio de comparacao entre duas cidades");
				System.out.println("3 - relatorio de todas as cidades");
				System.out.println("4 - inserir coleta");
				System.out.println("5 - atualizar coleta");
				System.out.println("6 - deletar coleta");
				System.out.print("opcao: ");

				while (sc1.hasNext()) {
					resp = "";
					switch (sc1.next()) {

					case "1":
						sc2 = new Scanner(System.in);
						System.out.println("");
						System.out.println("1 - São_Paulo");
						System.out.println("2 - Guarulhos");
						System.out.println("3 - Campinas");
						System.out.println("4 - São_Bernardo_do_Campo");
						System.out.println("5 - São_José_dos_Campos");
						System.out.print("cidade: ");

						while (sc2.hasNext()) {
							switch (sc2.next()) {

							case "1":
								sql = "select * from pandemia where cidade = 'São_Paulo' order by data desc,id desc limit 1;";
								break;
							case "2":
								sql = "select * from pandemia where cidade = 'Guarulhos' order by data desc,id desc limit 1;";
								break;
							case "3":
								sql = "select * from pandemia where cidade = 'Campinas' order by data desc,id desc limit 1;";
								break;
							case "4":
								sql = "select * from pandemia where cidade = 'São_Bernardo_do_Campo' order by data desc,id desc limit 1;";
								break;
							case "5":
								sql = "select * from pandemia where cidade = 'São_José_dos_Campos' order by data desc,id desc limit 1;";
								break;
							}

							stmt = conn.createStatement();
							rset = stmt.executeQuery(sql);

							while (rset.next()) {
								resp += "\nid: " + Integer.toString(rset.getInt("id"));
								resp += "\ncidade: " + rset.getString("cidade");
								resp += "\nocorrencias: " + Integer.toString(rset.getInt("ocorrencias"));
								resp += "\ndata: " + rset.getString("data");
								resp += "\npopulacao: " + Integer.toString(rset.getInt("populacao"));
								resp += "\npercentual: " + Float.toString(rset.getFloat("ocorrencias") / rset.getFloat("populacao")) + "%";
								System.out.println(resp);
							}

							System.out.print("opcao: ");
							break;
						}

						break;

					case "2":
						sc2 = new Scanner(System.in);
						System.out.println("");
						System.out.println("1 - São_Paulo");
						System.out.println("2 - Guarulhos");
						System.out.println("3 - Campinas");
						System.out.println("4 - São_Bernardo_do_Campo");
						System.out.println("5 - São_José_dos_Campos");
						System.out.print("cidade: ");

						while (sc2.hasNext()) {
							switch (sc2.next()) {

							case "1":
								sql = "select * from pandemia where cidade = 'São_Paulo' order by data desc,id desc limit 1;";

								break;

							case "2":
								sql = "select * from pandemia where cidade = 'Guarulhos' order by data desc,id desc limit 1;";

								break;

							case "3":
								sql = "select * from pandemia where cidade = 'Campinas' order by data desc,id desc limit 1;";

								break;

							case "4":
								sql = "select * from pandemia where cidade = 'São_Bernardo_do_Campo' order by data desc,id desc limit 1;";

								break;

							case "5":
								sql = "select * from pandemia where cidade = 'São_José_dos_Campos' order by data desc,id desc limit 1;";

								break;

							}

							stmt = conn.createStatement();
							rset = stmt.executeQuery(sql);

							while (rset.next()) {
								resp += "\nid: " + Integer.toString(rset.getInt("id"));
								resp += "\ncidade: " + rset.getString("cidade");
								resp += "\nocorrencias: " + Integer.toString(rset.getInt("ocorrencias"));
								resp += "\ndata: " + rset.getString("data");
								resp += "\npopulacao: " + Integer.toString(rset.getInt("populacao"));
								resp += "\npercentual: " + Float.toString(rset.getFloat("ocorrencias") / rset.getFloat("populacao")) + "%";
							}

							break;
						}

						System.out.print("cidade: ");

						while (sc2.hasNext()) {
							switch (sc2.next()) {

							case "1":
								sql = "select * from pandemia where cidade = 'São_Paulo' order by data desc,id desc limit 1;";

								break;

							case "2":
								sql = "select * from pandemia where cidade = 'Guarulhos' order by data desc,id desc limit 1;";

								break;

							case "3":
								sql = "select * from pandemia where cidade = 'Campinas' order by data desc,id desc limit 1;";

								break;

							case "4":
								sql = "select * from pandemia where cidade = 'São_Bernardo_do_Campo' order by data desc,id desc limit 1;";

								break;

							case "5":
								sql = "select * from pandemia where cidade = 'São_José_dos_Campos' order by data desc,id desc limit 1;";

								break;

							}

							stmt = conn.createStatement();
							rset = stmt.executeQuery(sql);

							while (rset.next()) {
								resp += "\n\nid: " + Integer.toString(rset.getInt("id"));
								resp += "\ncidade: " + rset.getString("cidade");
								resp += "\nocorrencias: " + Integer.toString(rset.getInt("ocorrencias"));
								resp += "\ndata: " + rset.getString("data");
								resp += "\npopulacao: " + Integer.toString(rset.getInt("populacao"));
								resp += "\npercentual: " + Float.toString(rset.getFloat("ocorrencias") / rset.getFloat("populacao")) + "%";
								break;
							}
							System.out.println(resp);
							System.out.print("opcao: ");
							break;
						}

						break;

					case "3":
						sql = "select * from pandemia where cidade = 'São_Paulo' order by data desc,id desc limit 1;";
						stmt = conn.createStatement();
						rset = stmt.executeQuery(sql);

						while (rset.next()) {
							resp += "\nid: " + Integer.toString(rset.getInt("id"));
							resp += "\ncidade: " + rset.getString("cidade");
							resp += "\nocorrencias: " + Integer.toString(rset.getInt("ocorrencias"));
							resp += "\ndata: " + rset.getString("data");
							resp += "\npopulacao: " + Integer.toString(rset.getInt("populacao"));
							resp += "\npercentual: " + Float.toString(rset.getFloat("ocorrencias") / rset.getFloat("populacao")) + "%";
							break;
						}

						sql = "select * from pandemia where cidade = 'Guarulhos' order by data desc,id desc limit 1;";
						stmt = conn.createStatement();
						rset = stmt.executeQuery(sql);

						while (rset.next()) {
							resp += "\n\nid: " + Integer.toString(rset.getInt("id"));
							resp += "\ncidade: " + rset.getString("cidade");
							resp += "\nocorrencias: " + Integer.toString(rset.getInt("ocorrencias"));
							resp += "\ndata: " + rset.getString("data");
							resp += "\npopulacao: " + Integer.toString(rset.getInt("populacao"));
							resp += "\npercentual: " + Float.toString(rset.getFloat("ocorrencias") / rset.getFloat("populacao")) + "%";
							break;
						}

						sql = "select * from pandemia where cidade = 'Campinas' order by data desc,id desc limit 1;";
						stmt = conn.createStatement();
						rset = stmt.executeQuery(sql);

						while (rset.next()) {
							resp += "\n\nid: " + Integer.toString(rset.getInt("id"));
							resp += "\ncidade: " + rset.getString("cidade");
							resp += "\nocorrencias: " + Integer.toString(rset.getInt("ocorrencias"));
							resp += "\ndata: " + rset.getString("data");
							resp += "\npopulacao: " + Integer.toString(rset.getInt("populacao"));
							resp += "\npercentual: " + Float.toString(rset.getFloat("ocorrencias") / rset.getFloat("populacao")) + "%";
							break;
						}

						sql = "select * from pandemia where cidade = 'São_Bernardo_do_Campo' order by data desc,id desc limit 1;";
						stmt = conn.createStatement();
						rset = stmt.executeQuery(sql);

						while (rset.next()) {
							resp += "\n\nid: " + Integer.toString(rset.getInt("id"));
							resp += "\ncidade: " + rset.getString("cidade");
							resp += "\nocorrencias: " + Integer.toString(rset.getInt("ocorrencias"));
							resp += "\ndata: " + rset.getString("data");
							resp += "\npopulacao: " + Integer.toString(rset.getInt("populacao"));
							resp += "\npercentual: " + Float.toString(rset.getFloat("ocorrencias") / rset.getFloat("populacao")) + "%";
							break;
						}

						sql = "select * from pandemia where cidade = 'São_José_dos_Campos' order by data desc,id desc limit 1;";
						stmt = conn.createStatement();
						rset = stmt.executeQuery(sql);

						while (rset.next()) {
							resp += "\n\nid: " + Integer.toString(rset.getInt("id"));
							resp += "\ncidade: " + rset.getString("cidade");
							resp += "\nocorrencias: " + Integer.toString(rset.getInt("ocorrencias"));
							resp += "\ndata: " + rset.getString("data");
							resp += "\npopulacao: " + Integer.toString(rset.getInt("populacao"));
							resp += "\npercentual: " + Float.toString(rset.getFloat("ocorrencias") / rset.getFloat("populacao")) + "%";
							break;
						}

						System.out.println(resp);
						System.out.print("opcao: ");

						break;

					case "4":
						sql = "insert into pandemia values (null, '";

						sc2 = new Scanner(System.in);
						System.out.print("\ncidade: ");

						while (sc2.hasNext()) {
							sql += sc2.next() + "', ";
							break;
						}

						sc2 = new Scanner(System.in);
						System.out.print("ocorrencias: ");

						while (sc2.hasNext()) {
							sql += sc2.next() + ", '";
							break;
						}

						sc2 = new Scanner(System.in);
						System.out.print("data(yyyy-mm-dd): ");

						while (sc2.hasNext()) {
							sql += sc2.next() + "', ";
							break;
						}

						sc2 = new Scanner(System.in);
						System.out.print("populacao: ");

						while (sc2.hasNext()) {
							sql += sc2.next() + ");";
							break;
						}
						
						stmt = conn.createStatement();
						stmt.execute(sql);
						
						System.out.print("\nopcao: ");

						break;
					case "5":
						sql = "update pandemia set cidade = '";

						sc2 = new Scanner(System.in);
						System.out.print("\ncidade: ");

						while (sc2.hasNext()) {
							sql += sc2.next();
							break;
						}

						sc2 = new Scanner(System.in);
						System.out.print("ocorrencias: ");

						while (sc2.hasNext()) {
							sql += "', ocorrencias = " + sc2.next();
							break;
						}

						sc2 = new Scanner(System.in);
						System.out.print("data(yyyy-mm-dd): ");

						while (sc2.hasNext()) {
							sql += ", data = '" + sc2.next();
							break;
						}

						sc2 = new Scanner(System.in);
						System.out.print("populacao: ");

						while (sc2.hasNext()) {
							sql += "', populacao = " + sc2.next();
							break;
						}

						sc2 = new Scanner(System.in);
						System.out.print("id: ");

						while (sc2.hasNext()) {
							sql += " where id = " + sc2.next() + ";";
							break;
						}
						
						stmt = conn.createStatement();
						stmt.execute(sql);
						
						System.out.print("\nopcao: ");

						break;

					case "6":
						System.out.print("\nid: ");
						sc2 = new Scanner(System.in);

						while (sc2.hasNext()) {
							sql = "delete from pandemia where id = " + sc2.next() + ";";
							break;
						}
						
						stmt = conn.createStatement();
						stmt.execute(sql);
						
						System.out.print("\nopcao: ");

						break;
					}
				}

			}
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}