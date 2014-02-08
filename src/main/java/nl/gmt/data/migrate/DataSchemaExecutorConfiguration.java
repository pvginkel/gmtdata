package nl.gmt.data.migrate;

import nl.gmt.data.drivers.DatabaseDriver;

public class DataSchemaExecutorConfiguration {
    private String schemaFileName;
    private String connectionString;
    private boolean noConstraintsOrIndexes;
    private DatabaseDriver databaseDriver;

    public DataSchemaExecutorConfiguration(String schemaFileName) {
        this(schemaFileName, null, false, null);
    }

    public DataSchemaExecutorConfiguration(String schemaFileName, String connectionString, boolean noConstraintsOrIndexes, DatabaseDriver databaseDriver) {
        this.schemaFileName = schemaFileName;
        this.connectionString = connectionString;
        this.noConstraintsOrIndexes = noConstraintsOrIndexes;
        this.databaseDriver = databaseDriver;
    }

    public String getSchemaFileName() {
        return schemaFileName;
    }

    public String getConnectionString() {
        return connectionString;
    }

    public boolean isNoConstraintsOrIndexes() {
        return noConstraintsOrIndexes;
    }

    public DatabaseDriver getDatabaseDriver() {
        return databaseDriver;
    }
}
