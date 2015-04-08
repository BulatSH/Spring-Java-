package edu.kfu.itis.spring.day02.lab03;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:context2-03.xml")
public class SpeakingRobotTest {

    @Autowired
    private SpeakingRobot robot;

    @Test
    public void testRandomQuotes() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context2-03.xml");
        SpeakingRobot robot = context.getBean(SpeakingRobot.class);
        Assert.assertNotEquals(robot.speak(), robot.speak());
    }
}
