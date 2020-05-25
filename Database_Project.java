// Author: Ishan Dias


import java.sql.*;

public class Database_Project {

    public static void selectCustomerAllData(Statement s) {
        try {
            //Select
            System.out.println("Executing Select...");
            ResultSet q = s.executeQuery("select * from customers");


            while (q.next()) {
                System.out.println(q.getInt("CID") + "," + q.getString("Cname"));

            }
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }

    // INSERT METHODS ---------------------------------------------------------------------------------------------

    public static void insertCustomersTable(Statement s, Integer CID, String Cname, String Cphone, String Cemail, String Caddr) {
        try {
            //Select
            System.out.println("Executing Insert into customers table...");
            s.executeUpdate("Insert into customers(CID, Cname, Cphone, Cemail, Caddr" +
                    ") values(" + CID + ",'" + Cname + "','" + Cphone + "','" + Cemail + "','" + Caddr + "')");
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }

    public static void insertOrdersTable(Statement s, Integer OID, String Cname, String Odate, Integer CID) {
        try {
            //Select
            System.out.println("Executing Insert into orders Table...");
            s.executeUpdate("Insert into orders(OID, Cname, Odate, CID) values(" + OID + ",'" + Cname + "'," +
                    "'" + Odate + "'," + CID + ")");
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }

    public static void insertProductsTable(Statement s, Integer PID, String Pname, String Pinfo, float Pprice) {
        try {
            //Select
            System.out.println("Executing Insert into Products Table...");
            s.executeUpdate("Insert into products(PID,Pname,Pinfo,Pprice) values(" + PID + ",'" + Pname + "'," +
                    "'" + Pinfo + "'," + Pprice + ")");
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }

    public static void insertSuppliersTable(Statement s, Integer SID, String Sname, String Sphone, String Semail, String Saddr) {
        try {
            //Select
            System.out.println("Executing Insert into Suppliers Table...");
            s.executeUpdate("Insert into suppliers(SID, Sname, Sphone, Semail, Saddr) values(" + SID + ",'" + Sname + "'," +
                    "'" + Sphone + "','" + Semail + "','" + Saddr + "')");
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }

    public static void insertOrdersProductsTable(Statement s, Integer Qty, Integer PID, Integer OID) {
        try {
            //Select
            System.out.println("Executing Insert into OrdersProducts Table...");
            s.executeUpdate("Insert into OrdersProducts(Qty,PID,OID) values(" + Qty + "," + PID + "," + OID + ")");
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }

    public static void insertProductsSuppliersTable(Statement s, Integer PID, Integer SID) {
        try {
            //Select
            System.out.println("Executing Insert into ProductsSuppliers Table...");
            s.executeUpdate("Insert into ProductsSuppliers(PID,SID) values(" + PID + "," + SID + ")");
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }


    // UPDATE METHODS ---------------------------------------------------------------------------------------------

    public static void updateCustomersTable(Statement s, int CID, String Cemail) {
        try {
            //Select
            System.out.println("Executing Update into Customers table...");
            s.executeUpdate("Update customers set Cemail='" + Cemail + "' where CID=" + CID + ";");
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }

    public static void updateOrdersTable(Statement s, int OID, String Odate) {
        try {
            //Select
            System.out.println("Executing Update into Orders table...");
            s.executeUpdate("Update orders set Odate='" + Odate + "' where OID=" + OID + ";");
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }

    public static void updateProductsTable(Statement s, int PID, String Pname) {
        try {
            //Select
            System.out.println("Executing Update into Products table...");
            s.executeUpdate("Update products set Pname='" + Pname + "' where PID=" + PID + ";");
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }

    public static void updateSuppliersTable(Statement s, int SID, String Saddr) {
        try {
            //Select
            System.out.println("Executing Update into Suppliers table...");
            s.executeUpdate("Update suppliers set Saddr='" + Saddr + "' where SID=" + SID + ";");
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }

    public static void updateOrdersProductsTable(Statement s, int PID, int Qty) {
        try {
            //Select
            System.out.println("Executing Update into Ordersproducts table...");
            s.executeUpdate("Update ordersproducts set Qty='" + Qty + "' where PID=" + PID + ";");
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }

    public static void updateProductsSuppliersTable(Statement s, int PID, int SID) {
        try {
            //Select
            System.out.println("Executing Update into ProductsSuppliers table...");
            s.executeUpdate("Update ProductsSuppliers set PID='" + PID + "' where SID=" + SID + ";");
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }

    // DELETE METHODS ---------------------------------------------------------------------------------------------

    public static void deleteCustomersTable(Statement s, Integer CID) {
        try {
            //Select
            System.out.println("Executing Update into Customers table...");
            s.executeUpdate("delete from customers where CID=" + CID + ";");
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }

    public static void deleteOrdersTable(Statement s, Integer OID) {
        try {
            //Select
            System.out.println("Executing Update into Orders table...");
            s.executeUpdate("delete from orders where OID=" + OID + ";");
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }

    public static void deleteProductsTable(Statement s, Integer PID) {
        try {
            //Select
            System.out.println("Executing Update into Products table...");
            s.executeUpdate("delete from products where PID=" + PID + ";");
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }

    public static void deleteSuppliersTable(Statement s, Integer SID) {
        try {
            //Select
            System.out.println("Executing Update into Suppliers table...");
            s.executeUpdate("delete from suppliers where SID=" + SID + ";");
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }

    public static void deleteOrdersProductsTable(Statement s, Integer Qty) {
        try {
            //Select
            System.out.println("Executing Update into OrdersProducts table...");
            s.executeUpdate("delete from OrdersProducts where Qty='" + Qty + "';");
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }

    public static void deleteProductsSuppliersTable(Statement s, Integer PID) {
        try {
            //Select
            System.out.println("Executing Update into ProductsSuppliers table...");
            s.executeUpdate("delete from ProductsSuppliers where PID=" + PID + ";");
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }

// Printing queries -----------------------------------------------------------------------------------------------

    public static void main(String[] args) {
        try {
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost/dbproject", "root", "dbpj27410");
            Statement s = myConn.createStatement();

            //selectCustomerAllData(s);
            insertCustomersTable(s, 11, "Thomas", "087-146-2374", "Thomas.kenny12@gmail.com", "165 Mayfield Douglas Co.Cork");
            insertOrdersTable(s, 11, "Thomas", "06-09-18", 11);
            insertProductsTable(s, 11, "Yogurt", "Contains 4 in each pack", 4);
            insertSuppliersTable(s, 11, "Gary", "085-142-9563", "Gary.Barlow@gmail.com", "Seabridge Warehouse Co.Dublin");
            insertOrdersProductsTable(s, 9, 11, 11);
            insertProductsSuppliersTable(s, 11, 11);

            updateCustomersTable(s, 11, "Thomas289@live.com");
            updateOrdersTable(s, 11, "12-07-18");
            updateProductsTable(s, 11, "Protein Shakers");
            updateSuppliersTable(s, 11, "Pineville Warehouse Co.Kilkenny");
            updateOrdersProductsTable(s, 11, 4);
            updateProductsSuppliersTable(s, 9, 11);

            deleteCustomersTable(s, 11);
            deleteOrdersTable(s, 11);
            deleteProductsTable(s, 11);
            deleteSuppliersTable(s, 11);
            deleteOrdersProductsTable(s, 4);
            deleteProductsSuppliersTable(s, 9);

        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }

}

