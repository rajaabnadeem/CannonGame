package cannongame;

import org.junit.Test;
import org.mockito.ArgumentCaptor;

import static org.mockito.Mockito.*;

public class GameFlowTest {

    @Test
     public void shootOnceTest(){

        //Given I have the game started

        IShotFlow mockShotFlow = mock(IShotFlow.class);
        IGameFlow gameFlow = new GameFlow(mockShotFlow);
        int x = gameFlow.getxTarget();
        int y = gameFlow.getyTarget();
        when(mockShotFlow.shoot(x,y)).thenReturn(true);

        //when the GameFlow class is executed

        gameFlow.playGame();

        //Then I call the ShotFlow class once

        verify(mockShotFlow, times(1)).shoot(x,y);

    }

    @Test
    public void shootTwiceTest(){

        //Given I have the game started

        IShotFlow mockShotFlow = mock(IShotFlow.class);
        IGameFlow gameFlow = new GameFlow(mockShotFlow);
        int x = gameFlow.getxTarget();
        int y = gameFlow.getyTarget();
        when(mockShotFlow.shoot(x,y)).thenReturn(false).thenReturn(true);

        //when the GameFlow class is executed

        gameFlow.playGame();

        //Then I call the ShotFlow class twice

        verify(mockShotFlow, times(2)).shoot(x,y);

    }






}
