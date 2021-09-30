# CannonGame

**VelocityValidator:** Shilpa
  -
    - Given: The user is asked for a velocity input
    - When: The user inputs a velocity of 1
    - Then: The velocity is valid
  -
    - Given: The user is asked for a velocity input
    - When: The user inputs a velocity of 21
    - Then: The velocity is invalid
  -
    - Given: The user is asked for a velocity input
    - When: The user inputs a velocity of 0
    - Then: The velocity is invalid
  -
    - Given: The user is asked for a velocity input
    - When: The user inputs a velocity of 20
    - Then: The velocity is valid
  
---

**AngleValidator:** Ramsha
  -
    - Given: The user is asked for an angle input
    - When: The user inputs a angle of 1
    - Then: That angle is valid
-
  - Given: The user is asked for an angle input
  - When: The user inputs an angle of 91
  - Then: The angle is invalid
 - 
  - Given: The user is asked for an angle input
  - When: The user inputs an angle of 90
  - Then: The angle is valid
 -
  - Given: The user is asked for an angle input
  - When: The user inputs an angle of 0
  - Then: The angle is invalid
  
---

**Angle to Degree conversion:** Rajaab
-
  - Given: I have an angle of 45
  - When: I need it to be converted to degrees
  - Then: I would pass the angle into the degree function and get back 0.78
-
  - Given: I have an angle of 1
  - When: I need it to be converted to degrees
  - Then: I would pass the angle into the degree function and get back /*SOMETHING*/
  
---

**Getting final x coordinate:** Roberto
- 
  - Given: I have a degree of 0.78 and a velocity of 10
  - When I need to calculate the final x coordinate
  - Then: I would pass the degree and velocity into the cosine function and get back 7.11
 - 
  - Given: I have a degree of A and a velocity of B
  - When I need to calculate the final x coordinate
  - Then: I would pass the degree and velocity into the cosine function and get back C
 
---

**Getting final y coordinate:** Priyanka
-
  - Given: I have a degree of 0.78 and a velocity of 10
  - When I need to calculate the final y coordinate
  - Then: I would pass the degree and velocity into the sine function and get back 7.03
  -
  - Given: I have a degree of A and a velocity of B
  - When I need to calculate the final y coordinate
  - Then: I would pass the degree and velocity into the sine function and get back C
  
---
** Rounding Object ** Irfa
-
 - Given: I have a number 7.5
 - When: I round the number
 - Then: I get back 8
 -
 - Given: I have the number 7.1
 - When: I round the number
 - Then: I get back 7

**Determining if the target was hit:** Chuck
  - Given: Our final x and y coordinates are (7, 7) and our target is (7, 7)
  - When: We determine if our cannon hits
  - Then: I have successfully hit the target
-

  - Given: Our final x and y coordinates are (7, 7) and our target is (8, 8)
  - When: We determine if our cannon hits
  - Then: I have not hit the target
  - 

  - Given: Our final x and y coordinates are (7, 7) and our target is (7, 8)
  - When: We determine if our cannon hits
  - Then: I have not hit the target
-

  - Given: Our final x and y coordinates are (7, 7) and our target is (8, 7)
  - When: We determine if our cannon hits
  - Then: I have not hit the target

**Attempts** Mansour
  - Given: I the user hasn't shot yet
  - When: The user shoots
  - Then: The number of shots is 1
  
  - Given: I the user has shot once
  - When: The user shoots again
  - Then: The number of shots is 2
