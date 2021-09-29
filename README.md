# CannonGame

---

**Target:**
  - Given: I need a target and target x, y coordinates are between 1 and 10
  - When: The target is created
  - Then: I get a target with x and y coordinates between 1 and 10
  
---

**Velocity:**
  -
    - Given: The user is asked for a velocity input
    - When: The user inputs a velocity of 10
    - Then: The velocity is valid
  -
    - Given: I have a the number 10
    - When: I create the velocity object
    - Then: The velocity is stored in a variable
  -
    - Given: The user is asked for a velocity input
    - When: The user inputs a velocity of 21
    - Then: The velocity is invalid
  
---

**Angle:**
  -
    - Given: The user is asked for an angle input
    - When: The user inputs a angle of 45
    - Then: That angle is valid
-
  - Given: I have an angle of 45
  - When: I create the angle object
  - Then: That angle is stored in a variable
-
  - Given: The user is asked for an angle input
  - When: The user inputs a velocity of 300
  - Then: The angle is invalid
  
---

**Angle to Degree conversion:**
  - Given: I have an angle of 45
  - When: I need it to be converted to degrees
  - Then: I would pass the angle into the degree function and get back 0.78
  
---

**Getting final x coordinate:**

  - Given: I have a degree of 0.78 and a velocity of 10
  - When I need to calculate the final x coordinate
  - Then: I would pass the degree and velocity into the cosine function and get back 7.11
 
---

**Getting final y coordinate:**
  - Given: I have a degree of 0.78 and a velocity of 10
  - When I need to calculate the final y coordinate
  - Then: I would pass the degree and velocity into the sine function and get back 7.03
  
---

**Determining if the target was hit:**
  - Given: Our final x and y coordinates are (7.11, 7.03) and our target is (7, 7)
  - When: We determine if our cannon hits
  - Then: I have successfully hit the target
-
  - Given: Our final x and y coordinates are (7.11, 7.03) and our target is (8, 8)
  - When: We determine if our cannon hits
  - Then: I have not hit the target
-
  - Given: This was the second shot
  - When: The target was hit
  - Then: I get back 2



