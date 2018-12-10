object Main extends App {

  //ENUM FUNCT
//  println(Enumeration.Constants.Zero)
//  println(Enumeration.Constants.Test)

  //ARRAY FUNCT
//  val array1 = Collections.Arrays.array1
//  array1.foreach(item => println(item))
//  array1.foreach(item => println(item * 5))
//  println(array1.max)
//  println(array1.foldLeft(100)(_ + _))
//  val array1Edited = 0 +: array1 :+ 6
//  array1Edited.foreach(item => println(item))

  //LIST FUNCT
//  val list1 = Collections.Lists.list3
//  list1.foreach(item => println(item))
//  println(list1.filter(item=> item>=5))
//  val  list2 = Collections.Lists.list4
//  val list3 = list2.flatMap(_.toUpperCase)
//  println(list3)

  //MAP FUNCT
//  val map1 = Collections.Maps.map1
//  println(map1(3))
//  println(map1 contains(4))
//  val map2 = Collections.Maps.map2
//  println(map2(2))

  //SET FUNCT
//  val set1 = Collections.Sets.set1;
//  println(set1)
//  println(set1 contains(9))
//  val set2 = Collections.Sets.set3
//  println(set2)
//  println(set1 ++ set2)
//  println(set1 -- set2)
//  println(set1 &~ set2)
//  println(set1 & set2)


  //VECTOR FUNCT
//  val vector1 = Collections.Vectors.vector1
//  println(vector1)
//  val vector2 = vector1 updated(1,33)
//  println(vector2)
//  println(vector2 sorted)
//  val vector3 = 9 +: vector2 :+ 4
//  println(vector3)

  //STREAM FUNCT
  val fibinacci = Collections.Streams.fibs
  fibinacci take(9) foreach(println)
}


