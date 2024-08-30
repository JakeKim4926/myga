package jake.myga_back.common.config;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
import org.springframework.transaction.support.TransactionSynchronizationManager;

public class DataSourceRouting extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {
        // 쓰기 작업인지 읽기 작업인지에 따라 데이터 소스를 선택
        if (TransactionSynchronizationManager.isCurrentTransactionReadOnly()) {
            return "slave";
        } else {
            return "master";
        }
    }
}