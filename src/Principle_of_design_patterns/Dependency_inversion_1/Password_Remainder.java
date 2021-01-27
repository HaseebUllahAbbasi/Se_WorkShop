package Principle_of_design_patterns.Dependency_inversion_1;

interface DBConnection
{
    int connect();
}

public class Password_Remainder
{
    //this depending on mysqlConnection class
    private  DBConnection db_connection;
    public Password_Remainder(MysqlConnection db_con)
    {
        this.db_connection = db_con;
    }


}
