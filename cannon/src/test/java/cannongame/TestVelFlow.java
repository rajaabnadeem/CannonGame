package cannongame;

import org.junit.Test;

import java.io.ByteArrayInputStream;

import static org.mockito.Mockito.*;

public class TestVelFlow {

    @Test
    public void testflowvalid() {

        String input = "10";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        IVelocityValidityCheckObj mockVelValChkObj = mock(IVelocityValidityCheckObj.class);
        when(mockVelValChkObj.checkVelocity(10.00)).thenReturn(Boolean.TRUE);

        IFlowClassVel FlowClassVelObj = new FlowClassVel(mockVelValChkObj);

      FlowClassVelObj.FlowVel(10.00);

        verify(mockVelValChkObj, times(1)).checkVelocity(10.00);
    }

    @Test
    public void testflowinvalid() {

        String input = "40";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        IVelocityValidityCheckObj mockVelValChkObj = mock(IVelocityValidityCheckObj.class);
        when(mockVelValChkObj.checkVelocity(40.00)).thenReturn(Boolean.TRUE);

        IFlowClassVel FlowClassVelObj = new FlowClassVel(mockVelValChkObj);

        FlowClassVelObj.FlowVel(10.00);

        verify(mockVelValChkObj, times(1)).checkVelocity(10.00);
    }
}

