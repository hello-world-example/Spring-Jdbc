package xyz.kail.demo.spring.jdbc;

import org.springframework.jdbc.datasource.DataSourceUtils;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * 支持事务
 *
 * @see org.springframework.jdbc.datasource.DataSourceTransactionManager
 * @see DataSourceUtils#getConnection
 */
public class DataSourceUtilsMain {

    public static void main(String[] args) throws SQLException {

        DataSource dataSource = null;

        /*
         * 获取链接，如果当前线程被 DataSourceTransactionManager 管理，则会获取当前事务的链接
         */
        final Connection connection = DataSourceUtils.getConnection(dataSource);

        /*
         * 释放连接，支持事务
         */
        DataSourceUtils.releaseConnection(connection, dataSource);


        connection.setAutoCommit(false);

    }

}
