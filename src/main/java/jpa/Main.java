package jpa;

import jpa.config.SpringConfig;
import jpa.entity.XayDungEntity;
import jpa.repository.Repository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.text.html.parser.Entity;

/**
 * Created by DELL on 06/07/17.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Repository repository = context.getBean("repository",Repository.class);

        // them
//        XayDungEntity xayDungEntity = new XayDungEntity();
//        xayDungEntity.setName("ho");
//        xayDungEntity.setPhanloai("tho");
//        xayDungEntity.setLuong(260000);
//        repository.save(xayDungEntity);

        //sua
//        XayDungEntity xayDungEntity = repository.findOne(1);
//        xayDungEntity.setName("Phan Tham");
//        xayDungEntity.setLuong(280000);
//        repository.save(xayDungEntity);

        //xoa
        repository.delete(1);

        System.out.println("Chay xong");
    }
}
