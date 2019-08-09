package com.shxp.harbor.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = "com.shxp.harbor.dao.renren",sqlSessionFactoryRef = "renrenSqlSessionFactory")
public class RenrenDataSourceConfig {

    @Bean(name = "renrenDataSource")
    @ConfigurationProperties("datasource.renren")
    public DataSource renrenDataSource(){
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "renrenSqlSessionFactory")
    public SqlSessionFactory sqlSessionFactory(@Qualifier("renrenDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
        sessionFactoryBean.setDataSource(dataSource);
        sessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver()
        .getResources("classpath*:mybatis/renren/*.xml"));
        return sessionFactoryBean.getObject();
    }

}