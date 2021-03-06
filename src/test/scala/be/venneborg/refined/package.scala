package be.venneborg

import eu.timepit.refined._
import eu.timepit.refined.api.Refined
import eu.timepit.refined.boolean.And
import eu.timepit.refined.collection.{MaxSize, NonEmpty}
import eu.timepit.refined.numeric.Interval.Closed
import eu.timepit.refined.numeric.{Even, Negative, Positive}

package object refined {

  type Name = String Refined And[NonEmpty, MaxSize[W.`128`.T]]
  type Age = Int Refined Positive
  type Initials = String Refined And[NonEmpty, MaxSize[W.`3`.T]]
  type Stars = Int Refined Closed[W.`1`.T, W.`5`.T]
  type NegativeLong = Long Refined Negative
  type EvenLong = Long Refined Even


  type PosDouble = Double Refined Positive
  type NegativeFloat = Float Refined Negative
}
