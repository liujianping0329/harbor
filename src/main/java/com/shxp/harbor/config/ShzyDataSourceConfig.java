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
@MapperScan(basePackages = "com.shxp.harbor.dao.shzy",sqlSessionFactoryRef = "shzySqlSessionFactory")
public class ShzyDataSourceConfig {

    @Bean(name = "shzyDataSource")
    @ConfigurationProperties("datasource.shzy")
    public DataSource shzyDataSource(){
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "shzySqlSessionFactory")
    public SqlSessionFactory sqlSessionFactory(@Qualifier("shzyDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
        sessionFactoryBean.setDataSource(dataSource);
        sessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver()
        .getResources("classpath*:mybatis/shzy/*.xml"));
        return sessionFactoryBean.getObject();
    }

}