package com.fursa.strings

import scala.collection.immutable.Map

/**
 * @author nkakkireni
 */
object MinimumWindowLengthForString {
	def main(args: Array[String]): Unit = {
			val firstString = "cde"
					val secondString = "abcd12edaaaaaced"

					val trackMap = scala.collection.mutable.Map.empty[Char, Int]
							firstString.toCharArray().foreach(t => trackMap += (t -> 0))

							val windowLengths=secondString.toCharArray().zipWithIndex.map {
							case (x, i) => if (trackMap.isDefinedAt(x) ) {
								trackMap += (x -> i)
										if(trackMap.values.forall { x => x > 0})
										{  
											calculateWindowLength(trackMap.toMap);
										}
										else
											9999
							}
							else {
								9999
							}
							case _=> 9999
			}

			println("Min Window Length:::"+windowLengths.toList.min)
	}

	def calculateWindowLength(firstCharMap: Map[Char, Int]): Int = {
			(firstCharMap.values.max - firstCharMap.values.min)+1
	}
}