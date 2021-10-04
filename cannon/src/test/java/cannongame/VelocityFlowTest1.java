package cannongame;

import org.junit.Test;

import java.io.ByteArrayInputStream;

import static org.mockito.Mockito.*;

//import static org.mockito.Mockito.times;

public class VelocityFlowTest1 {
    @Test
    //Given the velocity value 10
    public void VelcoityIsCalled(){
        //when I call velocity method
        String velocityinput = "10";
        System.setIn(new ByteArrayInputStream(velocityinput.getBytes()));
        IVelocityValidityCheckObj mockVelocity=mock(IVelocityValidityCheckObj.class);
        when (mockVelocity.checkVelocity(10)).thenReturn(Boolean.TRUE);
        IVelocityFlow1 flow= new VelocityFlow1(mockVelocity);
        flow.getVelocity();
        //then call Velocityflow class once
        verify(mockVelocity,times(1)).checkVelocity(10);
    }
    @Test
    public void VelocityIsCalled2() {
        String velocityinput = "19.5";
        System.setIn(new ByteArrayInputStream(velocityinput.getBytes()));
        IVelocityValidityCheckObj mockVelocity=mock(IVelocityValidityCheckObj.class);
        when (mockVelocity.checkVelocity(10)).thenReturn(Boolean.TRUE);

        IVelocityFlow1 flow = new VelocityFlow1(mockVelocity);
        flow.getVelocity();

        verify(mockVelocity, times(2)).checkVelocity(19.5);

    }
}
