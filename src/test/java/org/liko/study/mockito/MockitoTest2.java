package org.liko.study.mockito;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.mockito.Mockito.verify;

/**
 * @Author liko
 * @Date 2019/6/14
 * @Version 1.0
 * @Description 使用注解来快速模拟
 */
@RunWith(MockitoJUnitRunner.class)// 初始化mock
public class MockitoTest2 {

    @Mock
    private List mockList;

    @Test
    public void shorthand() {
        mockList.add(1);
        verify(mockList).add(1);
    }
}
