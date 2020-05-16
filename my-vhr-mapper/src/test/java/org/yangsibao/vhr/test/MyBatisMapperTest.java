package org.yangsibao.vhr.test;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.yangsibao.vhr.mapper.HrMapper;
import org.yangsibao.vhr.model.Hr;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author yangsibao
 * @date 2020/5/14-10:20
 */
public class MyBatisMapperTest {


    public static void main(String[] args) throws IOException {
        //1.read the configuration file
        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");

        //2.create SqlSessionFactory
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);

        //3.create session
        SqlSession sqlSession = factory.openSession();

        //4.create the proxy object mapper, use the session
        HrMapper mapper = sqlSession.getMapper(HrMapper.class);

        //5.use the proxy
//        Hr hr = mapper.getHrById(3);

        List<Hr> allHr = mapper.getAllHrs(3, null);
        System.out.println(allHr);

        //6.close the resources
        sqlSession.close();
        in.close();


    }

}
