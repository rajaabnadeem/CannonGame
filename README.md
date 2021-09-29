# CannonGame


- Target:
  - Given: I need a target and target x, y coordinates are between 1 and 10
  - When: The target is created
  - Then: I get a target with x and y coordinates between 1 and 10

- Velocity:
  - Given: The user is asked for a velocity input
  - When: The user inputs a velocity of 10
  - Then: The velocity is valid

  - Given: I have a the number 10
  - When: I create the velocity object
  - Then: The velocity is stored in a variable

  - Given: The user is asked for a velocity input
  - When: The user inputs a velocity of 21
  - Then: The velocity is invalid

- Angle:
  - Given: The user is asked for an angle input
  - When: The user inputs a angle of 45
  - Then: That angle is valid

  - Given: I have an angle of 45
  - When: I create the angle object
  - Then: That angle is stored in a variable

  - Given: The user is asked for an angle input
  - When: The user inputs a velocity of 300
  - Then: The angle is invalid

Angle to Degree conversion:
  - Given: I have an angle of x
  - When: I need it to be converted to degrees
  - Then: I would pass the angle into the degree function and get back y
