package Principle_of_design_patterns.Dependency_inversion_1;

public class MysqlConnection implements  DBConnection
{

    @Override
    public int connect() {
        return 1;
    }
}
