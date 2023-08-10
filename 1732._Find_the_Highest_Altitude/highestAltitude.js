const highestAltitude = (arr) => {
  let maxAltitude = 0;
  let totalGain = 0;
  for (const gain of arr) {
    totalGain += gain;
    maxAltitude = Math.max(maxAltitude, totalGain);
  }
  return maxAltitude;
};

console.log(highestAltitude([-5,1,5,0,-7]));