/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecole.primaire;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hjuve
 */
public class DataBase {

    Connection connection;

    public DataBase() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/ecole_primaire?autoReconnect=true&useSSL=false";
            String user = "root";
            String password = "juve@juve";
            connection = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();

        }
    }
    
    public User RechercheElementUser(String email) {
        String sql = "SELECT*FROM utulisateur WHERE email = ? ";
        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1, email);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                User E = new User();
                E.setId(rs.getInt(1));
                E.setEmail(rs.getString(2));
                E.setPassWord(rs.getString(3));
                E.setRole(rs.getString(4));
                return E;
            }
            System.out.println("bravo!!!!element trouve!!!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;

    }
    public void enregitrerElementUser(User user) {
        String sql = "INSERT INTO utulisateur(email, password,role)values(?,?,?)";
        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1, user.getEmail());
            pst.setString(2, user.getPassWord());
            pst.setString(3,user.getRole());
            pst.execute();
            System.out.println(" Bravo!!!!!!!enregistrement avec succes!!!!!!!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /////////////////////////Afficher touteEleve//////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////
    public List<Eleve> afficherTouteleve() {
        List<Eleve> listeel = new ArrayList<Eleve>();
        try {
            String query = "select * from eleve";
            PreparedStatement pst = connection.prepareStatement(query);
            ResultSet res
                    = pst.executeQuery();
            Eleve el;
            while (res.next()) {
                el = new Eleve();
                el.setId(res.getInt("id"));
                el.setNom(res.getString("nom"));
                el.setPrenom(res.getString("prenom"));
                el.setClasse_fk(res.getInt("classe_fk"));
                listeel.add(el);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listeel;
    }
//////////////////////////////////Enregisrer Eleve/////////////////////// 

    public void enregitrerElementEleve(Eleve E) {
        String sql = "INSERT INTO Eleve(nom, prenom,classe_fk)values(?,?,?)";
        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1, E.getNom());
            pst.setString(2, E.getPrenom());
            pst.setInt(3,
                    E.getClasse_fk());
            pst.execute();
            System.out.println(" Bravo!!!!!!!enregistrement avec succes!!!!!!!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
//////////////////////////////////// Recherche eleve/////////////////////////////////////////////// 

    public Eleve RechercheElementEleve(int id) {
        String sql = "SELECT*FROM Eleve WHERE id =?";
        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                Eleve E = new Eleve();
                E.setClasse_fk(rs.getInt("classe_fk"));
                E.setId(rs.getInt("id"));
                E.setNom(rs.getString("nom"));
                E.setPrenom(rs.getString("prenom"));
                return E;
            }
            System.out.println("bravo!!!!element trouve!!!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;

    }
    ////////////////////////////////////////////////////////////////////suprimer/ /////////////////////// 

    public void SupprimerEleve(int id) {
        String sql = "DELETE FROM Eleve WHERE id=?";
        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setInt(1, id);
            pst.execute();
            System.out.println("bravo!!!!element est supprime!!!");

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    //////////////////////////////////////////////UPDATE/////////////////////////
    /////// 
    public void UpdateElementEleve(Eleve E) {
        String up = "UPDATE Eleve set nom=?,prenom=?,classe_fk=? where id=?";

        try {

            PreparedStatement pst = connection.prepareStatement(up);
            pst.setString(1, E.getNom());
            pst.setString(2, E.getPrenom());
            pst.setInt(3,
                    E.getClasse_fk());
            pst.setInt(4, E.getId());
            pst.execute();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

////////////fonction Professeur//////////////////////////////////
    public List<Professeur> afficherToutProfesseur() {
        List<Professeur> listepro = new ArrayList<Professeur>();
        try {
            String query = "select * from professeur";
            PreparedStatement pst = connection.prepareStatement(query);
            ResultSet res = pst.executeQuery();
            Professeur pro;
            while (res.next()) {
                pro = new Professeur();
                pro.setId(res.getInt("id"));
                pro.setNom(res.getString("nom"));
                pro.setPrenom(res.getString("prenom"));
                listepro.add(pro);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listepro;
    }
    //////////////////////////// fonction //////////////////////////// enregistre////////////////////////////////////////////////////////////////

    public void enregitrerElementProfesseur(Professeur P) {
        String sql = "INSERT INTO professeur(nom, prenom) values(?,?)";
        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1, P.getNom());
            pst.setString(2, P.getPrenom());
            pst.execute();
            System.out.println(" Bravo!!!!!!!enregistrement avec succes!!!!!!!");
        } catch (SQLException e) {
            e.printStackTrace();
        } // TODO Auto-generated catch block

    }

    ///////////////////////////// fonction recherche//////////////////////////////////////////////////////////////////
    public Professeur RechercheElementPofesseur(int id) {
        String sql = "SELECT*FROM Professeur WHERE id =?";
        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setInt(1, id);

            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                Professeur p = new Professeur();
                p.setId(rs.getInt("id"));
                p.setNom(rs.getString("nom"));
                p.setPrenom(rs.getString("prenom"));
                return p;
            }
            System.out.println("bravo!!!!element trouve!!!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;

    } //////////////////////////Fonction supprimer/////////////////////////

    public void SupprimerProfesseur(int id) {
        String sql = "DELETE FROM professeur WHERE id=?";
        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setInt(1, id);
            pst.execute();
            System.out.println("bravo!!!!element est supprime!!!");

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void UpdateElementProfesseur(Professeur p) {
        String up = "UPDATE Professeur set nom=?,prenom=? where id=?";
        try {
            PreparedStatement pst = connection.prepareStatement(up);
            pst.setString(1, p.getNom());
            pst.setString(2, p.getPrenom());
            pst.setInt(3, p.getId());
            pst.execute();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public List<Matiere> afficherToutMatiere() {
        List<Matiere> listeMat = new ArrayList<Matiere>();
        try {
            String query = "select * from Matiere";
            PreparedStatement pst = connection.prepareStatement(query);
            ResultSet res = pst.executeQuery();
            while (res.next()) {
                Matiere mat = new Matiere();
                mat.setId(res.getInt(1));
                mat.setNom(res.getString(2));
                listeMat.add(mat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listeMat;

    }////////////////////////////////// enregisrer matiere/////////////////////

    public void enregitrerElementMatiere(Matiere Mat) {
        String sql = "INSERT INTO Matiere(nom) values(?)";

        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1, Mat.getNom());
            pst.execute();
            System.out.println(" Bravo!!!!!!!enregistrement avec succes!!!!!!!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    ///////////////////////////////////// DELETE
    ///////////////////////////////////// MATIERE///////////////////////////////////////////////
    public void SupprimerMatiere(int id) {
        String sql = "DELETE FROM Matiere WHERE id=?";
        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setInt(1, id);
            pst.execute();
            System.out.println("bravo!!!!element est supprime!!!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

////////////////////////////////////////update////////////////////////////////////////
    public void UpdateElementMatiere(Matiere Mat) {
        String up = "UPDATE Matiere set nom=? where id=?";
        try {

            PreparedStatement pst = connection.prepareStatement(up);
            pst.setInt(2, Mat.getId());
            pst.setString(1, Mat.getNom());
            pst.execute();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    ///////////////////////////////////////// afficher///////////////////
    public List<Classe> afficherToutClasse() {
        List<Classe> listecl = new ArrayList<Classe>();
        try {
            String query = "select * from Classe";
            PreparedStatement pst = connection.prepareStatement(query);
            ResultSet res = pst.executeQuery();
            Classe cl;
            while (res.next()) {
                cl = new Classe();
                cl.setId(res.getInt("id"));
                cl.setNom(res.getString("nom"));
                listecl.add(cl);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listecl;
    }

    //////////////////////////////////////////////////////////////////////////
    public Classe RechercheElementClasse(int id) {
        String sql = "SELECT*FROM Classe WHERE id =?";
        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                Classe Cl = new Classe();
                Cl.setId(rs.getInt("id"));
                Cl.setNom(rs.getString("nom"));
                return Cl;
            }
            System.out.println("bravo!!!!element trouve!!!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
///////////////////////////////////////////////////////////////////////////////////////////////

    public void enregitrerElementClasse(Classe cl) {
        String sql = "INSERT INTO Classe(nom) values(?)";

        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1, cl.getNom());
            pst.execute();
            System.out.println(" Bravo!!!!!!!enregistrement avec succes!!!!!!!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void SupprimerClasse(int id) {
        String sql = "DELETE FROM Classe WHERE id=?";
        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setInt(1, id);
            pst.execute();
            System.out.println("bravo!!!!element est supprime!!!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void UpdateElemenClasse(Classe cl) {
        String up = "UPDATE Classe set nom=? where id=?";
        try {
            PreparedStatement pst = connection.prepareStatement(up);
            pst.setInt(2, cl.getId());
            pst.setString(1, cl.getNom());
            pst.execute();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
