function trackRobot(startingPoint, movements) {
    var currentLocation = startingPoint;

    //movements are clockwise, so north, east, south and west correspond to [0],[1],[2],[3] in an array
    var north = movements[0];
    var east = movements[1];
    var south = movements[2];
    var west = movements[3];

    //can move north/up or south/down, west/left or east/right
    var xDirection = east - west;
    var yDirection = north - south;

    currentLocation[0] =+ xDirection;
    currentLocation[1] =+ yDirection;
    console.log(currentLocation);
}

trackRobot([0,0], [20,30,10,40]);