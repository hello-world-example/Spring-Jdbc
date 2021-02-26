package xyz.kail.demo.spring.tx;


import org.springframework.transaction.support.TransactionSynchronizationManager;

import java.sql.SQLException;

/**
 * @see TransactionSynchronizationManager
 * #
 * @see org.springframework.transaction.support.AbstractPlatformTransactionManager#setTransactionSynchronization
 * @see org.springframework.transaction.support.TransactionSynchronization
 */
public class TransactionSynchronizationManagerMain {

    public static void main(String[] args) throws SQLException {

        TransactionSynchronizationManager.hasResource(123);


    }

}
