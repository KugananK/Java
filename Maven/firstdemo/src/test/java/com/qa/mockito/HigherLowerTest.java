package com.qa.mockito;

import java.util.Random;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class HigherLowerTest {
	
	@Mock
	private Random mockRng;
	
	@InjectMocks
	private higherLower highLow;

	
}
