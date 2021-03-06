package adventofcode_2021;


import utils.AdventOfCodeUtil;

import java.util.*;

public class AdventOfCode_2021_05 {

	static String input = "456,846 -> 221,846\n" +
			"980,926 -> 73,19\n" +
			"682,930 -> 562,930\n" +
			"766,592 -> 274,100\n" +
			"247,685 -> 247,21\n" +
			"106,800 -> 635,800\n" +
			"953,340 -> 135,340\n" +
			"293,223 -> 293,12\n" +
			"454,196 -> 454,463\n" +
			"886,766 -> 164,766\n" +
			"592,590 -> 192,590\n" +
			"436,982 -> 436,545\n" +
			"731,571 -> 420,260\n" +
			"741,11 -> 466,11\n" +
			"727,541 -> 579,541\n" +
			"341,553 -> 25,553\n" +
			"942,470 -> 942,196\n" +
			"203,600 -> 203,647\n" +
			"965,595 -> 949,611\n" +
			"554,306 -> 554,401\n" +
			"902,438 -> 902,728\n" +
			"864,609 -> 525,270\n" +
			"187,790 -> 187,323\n" +
			"956,950 -> 427,950\n" +
			"847,554 -> 422,554\n" +
			"935,900 -> 701,900\n" +
			"192,854 -> 866,180\n" +
			"512,946 -> 543,915\n" +
			"978,979 -> 491,979\n" +
			"708,61 -> 708,878\n" +
			"738,508 -> 282,52\n" +
			"23,25 -> 841,843\n" +
			"204,750 -> 204,797\n" +
			"703,500 -> 703,419\n" +
			"14,311 -> 694,311\n" +
			"646,301 -> 785,301\n" +
			"397,168 -> 439,168\n" +
			"680,931 -> 561,812\n" +
			"540,448 -> 90,448\n" +
			"706,668 -> 91,53\n" +
			"848,319 -> 318,319\n" +
			"198,948 -> 198,307\n" +
			"686,58 -> 686,541\n" +
			"867,234 -> 867,498\n" +
			"134,125 -> 134,688\n" +
			"824,566 -> 53,566\n" +
			"437,167 -> 276,167\n" +
			"94,65 -> 638,609\n" +
			"36,971 -> 971,36\n" +
			"494,330 -> 494,197\n" +
			"920,438 -> 920,364\n" +
			"698,84 -> 49,733\n" +
			"59,842 -> 59,876\n" +
			"328,577 -> 328,677\n" +
			"757,701 -> 134,78\n" +
			"466,274 -> 135,605\n" +
			"81,925 -> 988,18\n" +
			"40,142 -> 882,984\n" +
			"50,96 -> 882,928\n" +
			"782,47 -> 782,427\n" +
			"247,599 -> 24,599\n" +
			"112,812 -> 191,733\n" +
			"487,198 -> 144,198\n" +
			"327,663 -> 327,756\n" +
			"117,76 -> 688,76\n" +
			"530,71 -> 530,958\n" +
			"558,602 -> 671,489\n" +
			"677,830 -> 677,556\n" +
			"529,669 -> 349,669\n" +
			"336,966 -> 341,971\n" +
			"20,31 -> 851,862\n" +
			"423,880 -> 423,573\n" +
			"521,657 -> 552,657\n" +
			"412,822 -> 18,428\n" +
			"423,311 -> 423,105\n" +
			"381,614 -> 705,614\n" +
			"521,248 -> 394,121\n" +
			"286,47 -> 286,403\n" +
			"286,27 -> 711,452\n" +
			"347,61 -> 489,61\n" +
			"760,454 -> 760,954\n" +
			"746,573 -> 911,573\n" +
			"839,933 -> 839,776\n" +
			"124,815 -> 290,649\n" +
			"577,848 -> 419,848\n" +
			"393,206 -> 410,206\n" +
			"364,755 -> 881,755\n" +
			"788,68 -> 788,215\n" +
			"94,798 -> 192,798\n" +
			"292,250 -> 453,250\n" +
			"601,545 -> 293,237\n" +
			"438,923 -> 438,655\n" +
			"70,757 -> 887,757\n" +
			"184,402 -> 818,402\n" +
			"586,49 -> 103,49\n" +
			"202,315 -> 735,315\n" +
			"534,504 -> 534,523\n" +
			"367,236 -> 367,736\n" +
			"24,163 -> 24,240\n" +
			"185,426 -> 634,875\n" +
			"485,189 -> 39,189\n" +
			"556,30 -> 374,30\n" +
			"969,821 -> 676,528\n" +
			"254,435 -> 254,43\n" +
			"290,615 -> 741,164\n" +
			"345,601 -> 120,826\n" +
			"224,641 -> 887,641\n" +
			"190,716 -> 581,325\n" +
			"552,646 -> 552,393\n" +
			"413,177 -> 413,103\n" +
			"397,900 -> 360,900\n" +
			"138,980 -> 138,55\n" +
			"909,891 -> 909,593\n" +
			"926,986 -> 79,139\n" +
			"954,67 -> 53,968\n" +
			"180,30 -> 595,30\n" +
			"823,165 -> 823,660\n" +
			"285,176 -> 375,176\n" +
			"915,826 -> 184,95\n" +
			"735,230 -> 667,230\n" +
			"934,865 -> 917,865\n" +
			"48,602 -> 737,602\n" +
			"477,319 -> 385,411\n" +
			"981,17 -> 11,987\n" +
			"458,401 -> 24,401\n" +
			"118,415 -> 849,415\n" +
			"176,678 -> 176,852\n" +
			"567,753 -> 567,37\n" +
			"285,868 -> 830,323\n" +
			"555,623 -> 822,623\n" +
			"522,546 -> 674,546\n" +
			"880,21 -> 23,878\n" +
			"591,103 -> 591,407\n" +
			"434,64 -> 434,401\n" +
			"245,968 -> 275,968\n" +
			"726,510 -> 450,786\n" +
			"768,366 -> 768,738\n" +
			"488,745 -> 488,94\n" +
			"675,674 -> 675,705\n" +
			"618,237 -> 265,237\n" +
			"802,709 -> 802,59\n" +
			"144,696 -> 144,542\n" +
			"547,381 -> 547,799\n" +
			"78,667 -> 78,916\n" +
			"409,271 -> 302,271\n" +
			"294,694 -> 938,50\n" +
			"140,571 -> 97,571\n" +
			"682,875 -> 682,534\n" +
			"748,816 -> 748,183\n" +
			"84,622 -> 84,258\n" +
			"485,696 -> 582,599\n" +
			"909,233 -> 954,233\n" +
			"203,711 -> 203,350\n" +
			"335,904 -> 455,904\n" +
			"578,778 -> 578,21\n" +
			"830,954 -> 902,954\n" +
			"78,252 -> 78,682\n" +
			"920,220 -> 684,220\n" +
			"309,301 -> 104,301\n" +
			"270,795 -> 270,919\n" +
			"906,479 -> 304,479\n" +
			"627,164 -> 627,986\n" +
			"122,960 -> 915,167\n" +
			"664,916 -> 770,810\n" +
			"692,810 -> 826,810\n" +
			"981,951 -> 192,162\n" +
			"183,423 -> 809,423\n" +
			"632,464 -> 567,464\n" +
			"94,266 -> 94,587\n" +
			"261,770 -> 569,770\n" +
			"51,403 -> 466,818\n" +
			"631,645 -> 187,645\n" +
			"141,238 -> 141,145\n" +
			"357,21 -> 173,21\n" +
			"138,248 -> 839,949\n" +
			"889,957 -> 807,957\n" +
			"399,431 -> 105,725\n" +
			"548,331 -> 548,821\n" +
			"790,844 -> 43,97\n" +
			"675,671 -> 221,671\n" +
			"874,143 -> 620,397\n" +
			"205,435 -> 205,546\n" +
			"521,434 -> 822,133\n" +
			"141,86 -> 257,86\n" +
			"427,28 -> 290,165\n" +
			"49,694 -> 567,694\n" +
			"846,344 -> 266,924\n" +
			"425,910 -> 433,918\n" +
			"956,498 -> 485,27\n" +
			"798,498 -> 798,634\n" +
			"879,13 -> 766,126\n" +
			"737,475 -> 737,425\n" +
			"338,473 -> 425,386\n" +
			"510,615 -> 214,319\n" +
			"758,415 -> 758,490\n" +
			"969,208 -> 239,938\n" +
			"917,188 -> 917,528\n" +
			"34,820 -> 806,820\n" +
			"85,633 -> 857,633\n" +
			"262,355 -> 262,748\n" +
			"373,784 -> 971,186\n" +
			"146,577 -> 60,663\n" +
			"613,570 -> 613,199\n" +
			"300,319 -> 300,108\n" +
			"764,171 -> 764,17\n" +
			"555,921 -> 555,825\n" +
			"241,197 -> 770,197\n" +
			"600,832 -> 600,807\n" +
			"934,987 -> 20,73\n" +
			"960,730 -> 837,730\n" +
			"976,50 -> 46,980\n" +
			"829,834 -> 153,158\n" +
			"785,835 -> 785,58\n" +
			"586,633 -> 689,736\n" +
			"804,250 -> 348,706\n" +
			"226,539 -> 16,539\n" +
			"411,940 -> 98,940\n" +
			"289,589 -> 893,589\n" +
			"738,616 -> 738,55\n" +
			"225,54 -> 542,54\n" +
			"793,246 -> 303,736\n" +
			"332,752 -> 984,100\n" +
			"413,18 -> 839,444\n" +
			"840,122 -> 840,233\n" +
			"989,970 -> 215,196\n" +
			"329,361 -> 573,605\n" +
			"242,537 -> 242,619\n" +
			"943,898 -> 943,535\n" +
			"469,865 -> 501,833\n" +
			"226,717 -> 196,687\n" +
			"819,803 -> 712,803\n" +
			"532,663 -> 532,672\n" +
			"61,931 -> 940,52\n" +
			"623,218 -> 274,567\n" +
			"281,326 -> 281,790\n" +
			"815,176 -> 679,176\n" +
			"790,862 -> 942,710\n" +
			"18,771 -> 18,514\n" +
			"479,377 -> 309,377\n" +
			"704,402 -> 704,150\n" +
			"961,335 -> 492,335\n" +
			"745,829 -> 745,477\n" +
			"556,543 -> 771,543\n" +
			"832,336 -> 917,251\n" +
			"742,755 -> 742,174\n" +
			"206,735 -> 493,735\n" +
			"151,216 -> 312,55\n" +
			"445,157 -> 615,157\n" +
			"781,143 -> 781,76\n" +
			"833,717 -> 514,398\n" +
			"357,14 -> 357,36\n" +
			"771,405 -> 771,422\n" +
			"662,886 -> 169,886\n" +
			"689,990 -> 22,990\n" +
			"680,445 -> 379,445\n" +
			"92,369 -> 502,779\n" +
			"64,948 -> 64,363\n" +
			"295,957 -> 976,276\n" +
			"113,920 -> 634,399\n" +
			"542,662 -> 305,899\n" +
			"566,514 -> 566,645\n" +
			"528,106 -> 549,106\n" +
			"205,367 -> 821,367\n" +
			"313,105 -> 313,928\n" +
			"532,177 -> 532,664\n" +
			"862,773 -> 905,816\n" +
			"800,796 -> 911,796\n" +
			"870,80 -> 11,939\n" +
			"188,900 -> 154,900\n" +
			"420,509 -> 520,609\n" +
			"540,863 -> 28,863\n" +
			"31,72 -> 78,72\n" +
			"823,648 -> 503,648\n" +
			"879,252 -> 606,252\n" +
			"677,117 -> 677,507\n" +
			"743,303 -> 196,850\n" +
			"220,491 -> 220,891\n" +
			"216,815 -> 577,815\n" +
			"540,819 -> 745,819\n" +
			"152,721 -> 382,721\n" +
			"280,745 -> 985,745\n" +
			"479,367 -> 358,488\n" +
			"913,413 -> 649,413\n" +
			"40,678 -> 817,678\n" +
			"467,533 -> 467,214\n" +
			"132,68 -> 843,779\n" +
			"519,109 -> 669,259\n" +
			"619,791 -> 221,791\n" +
			"114,622 -> 628,622\n" +
			"951,636 -> 866,636\n" +
			"172,569 -> 775,569\n" +
			"244,972 -> 173,972\n" +
			"283,64 -> 739,520\n" +
			"68,604 -> 68,156\n" +
			"529,30 -> 529,925\n" +
			"813,883 -> 137,883\n" +
			"893,231 -> 629,231\n" +
			"673,658 -> 673,389\n" +
			"725,899 -> 218,899\n" +
			"317,318 -> 105,318\n" +
			"82,706 -> 100,688\n" +
			"222,227 -> 440,227\n" +
			"810,371 -> 810,985\n" +
			"414,321 -> 289,446\n" +
			"901,158 -> 260,799\n" +
			"198,967 -> 717,448\n" +
			"928,454 -> 875,454\n" +
			"974,437 -> 974,764\n" +
			"657,13 -> 760,13\n" +
			"498,966 -> 976,966\n" +
			"66,104 -> 66,15\n" +
			"773,569 -> 980,362\n" +
			"420,496 -> 403,513\n" +
			"57,920 -> 85,920\n" +
			"879,551 -> 879,662\n" +
			"98,395 -> 98,398\n" +
			"483,685 -> 483,55\n" +
			"222,935 -> 586,935\n" +
			"89,926 -> 807,208\n" +
			"744,160 -> 744,462\n" +
			"588,973 -> 588,548\n" +
			"312,572 -> 38,298\n" +
			"27,131 -> 552,656\n" +
			"591,935 -> 591,86\n" +
			"907,478 -> 907,279\n" +
			"981,75 -> 981,972\n" +
			"316,947 -> 935,947\n" +
			"906,38 -> 906,216\n" +
			"374,521 -> 345,550\n" +
			"579,29 -> 579,107\n" +
			"444,636 -> 444,557\n" +
			"458,608 -> 830,980\n" +
			"479,839 -> 155,515\n" +
			"766,600 -> 766,71\n" +
			"976,965 -> 31,20\n" +
			"928,49 -> 269,708\n" +
			"787,238 -> 787,983\n" +
			"583,742 -> 112,742\n" +
			"966,268 -> 554,680\n" +
			"671,354 -> 671,966\n" +
			"274,340 -> 274,894\n" +
			"673,185 -> 607,185\n" +
			"73,171 -> 874,171\n" +
			"861,526 -> 861,410\n" +
			"739,591 -> 739,138\n" +
			"209,355 -> 209,146\n" +
			"286,501 -> 887,501\n" +
			"495,902 -> 700,902\n" +
			"192,889 -> 821,260\n" +
			"400,21 -> 154,21\n" +
			"861,301 -> 325,301\n" +
			"552,990 -> 511,990\n" +
			"908,21 -> 11,918\n" +
			"127,724 -> 821,30\n" +
			"935,46 -> 170,811\n" +
			"947,91 -> 374,91\n" +
			"625,420 -> 265,60\n" +
			"214,228 -> 546,228\n" +
			"375,547 -> 715,887\n" +
			"516,350 -> 870,350\n" +
			"610,138 -> 665,193\n" +
			"214,621 -> 678,621\n" +
			"497,248 -> 600,145\n" +
			"549,558 -> 576,558\n" +
			"364,537 -> 364,312\n" +
			"840,324 -> 310,854\n" +
			"441,945 -> 441,458\n" +
			"459,531 -> 459,100\n" +
			"937,113 -> 150,900\n" +
			"277,405 -> 259,405\n" +
			"409,527 -> 409,359\n" +
			"534,766 -> 534,740\n" +
			"534,934 -> 681,934\n" +
			"456,419 -> 83,419\n" +
			"871,986 -> 873,986\n" +
			"14,59 -> 916,961\n" +
			"911,963 -> 971,963\n" +
			"25,325 -> 139,211\n" +
			"937,184 -> 354,767\n" +
			"460,416 -> 289,245\n" +
			"193,171 -> 861,839\n" +
			"840,299 -> 840,911\n" +
			"531,45 -> 531,619\n" +
			"599,315 -> 455,315\n" +
			"455,97 -> 455,811\n" +
			"38,748 -> 392,748\n" +
			"841,79 -> 841,88\n" +
			"105,571 -> 105,545\n" +
			"801,458 -> 344,458\n" +
			"491,535 -> 558,535\n" +
			"835,814 -> 223,202\n" +
			"563,85 -> 405,85\n" +
			"410,396 -> 600,396\n" +
			"273,670 -> 818,125\n" +
			"671,647 -> 817,647\n" +
			"46,892 -> 678,260\n" +
			"456,736 -> 110,736\n" +
			"962,941 -> 619,598\n" +
			"388,406 -> 53,71\n" +
			"558,895 -> 227,564\n" +
			"944,182 -> 807,319\n" +
			"484,898 -> 59,473\n" +
			"808,214 -> 488,534\n" +
			"451,679 -> 155,383\n" +
			"858,931 -> 381,931\n" +
			"723,377 -> 723,281\n" +
			"694,283 -> 182,795\n" +
			"385,191 -> 320,256\n" +
			"33,380 -> 584,931\n" +
			"480,91 -> 817,91\n" +
			"677,91 -> 677,126\n" +
			"291,651 -> 760,182\n" +
			"832,962 -> 153,283\n" +
			"38,60 -> 479,501\n" +
			"249,350 -> 789,350\n" +
			"603,341 -> 266,678\n" +
			"52,303 -> 52,102\n" +
			"911,201 -> 559,201\n" +
			"46,210 -> 46,275\n" +
			"960,212 -> 554,212\n" +
			"375,374 -> 169,580\n" +
			"10,10 -> 989,989\n" +
			"844,140 -> 40,944\n" +
			"916,408 -> 916,815\n" +
			"834,401 -> 834,169\n" +
			"553,479 -> 784,248\n" +
			"543,452 -> 543,848\n" +
			"854,910 -> 334,390\n" +
			"685,491 -> 793,491\n" +
			"552,943 -> 709,943\n" +
			"723,367 -> 124,367\n" +
			"95,55 -> 881,841\n" +
			"155,267 -> 573,267\n" +
			"59,357 -> 84,357\n" +
			"218,435 -> 218,344\n" +
			"491,584 -> 491,649\n" +
			"676,445 -> 676,333\n" +
			"361,618 -> 783,618\n" +
			"220,295 -> 220,267\n" +
			"668,758 -> 299,389\n" +
			"965,845 -> 674,845\n" +
			"285,603 -> 47,603\n" +
			"853,417 -> 853,757\n" +
			"859,906 -> 856,906\n" +
			"55,364 -> 753,364\n" +
			"893,474 -> 978,474\n" +
			"602,32 -> 58,576\n" +
			"171,445 -> 96,370\n" +
			"214,592 -> 214,286\n" +
			"400,946 -> 745,946\n" +
			"559,37 -> 112,484\n" +
			"624,510 -> 90,510\n" +
			"329,714 -> 329,850\n" +
			"458,287 -> 657,287\n" +
			"99,385 -> 99,949\n" +
			"50,736 -> 719,67\n" +
			"273,195 -> 273,306\n" +
			"490,902 -> 490,798\n" +
			"619,131 -> 921,131\n" +
			"266,652 -> 266,730\n" +
			"745,661 -> 745,555\n" +
			"311,878 -> 311,679\n" +
			"491,982 -> 643,830\n" +
			"735,875 -> 816,875\n" +
			"936,353 -> 936,529\n" +
			"792,467 -> 565,467\n" +
			"141,140 -> 141,988\n" +
			"98,171 -> 414,487\n" +
			"257,259 -> 257,484\n" +
			"24,41 -> 969,986\n" +
			"302,453 -> 223,453\n" +
			"807,363 -> 492,678\n" +
			"823,22 -> 835,10\n" +
			"301,94 -> 399,94\n" +
			"946,110 -> 248,808\n" +
			"983,985 -> 21,23\n" +
			"510,145 -> 510,58\n" +
			"13,661 -> 13,639\n" +
			"218,260 -> 218,54\n" +
			"475,846 -> 475,770\n" +
			"458,644 -> 458,529\n" +
			"912,934 -> 912,136\n" +
			"152,823 -> 550,823\n" +
			"136,470 -> 443,470\n" +
			"253,871 -> 905,219\n" +
			"765,212 -> 793,240\n" +
			"11,402 -> 11,42\n" +
			"348,813 -> 348,768\n" +
			"368,321 -> 823,776\n" +
			"343,495 -> 343,809\n" +
			"117,616 -> 117,273\n" +
			"92,92 -> 732,92\n" +
			"914,31 -> 28,917\n" +
			"259,944 -> 214,944\n" +
			"630,759 -> 462,759\n" +
			"134,653 -> 134,610\n" +
			"14,989 -> 988,15\n" +
			"139,181 -> 139,451\n" +
			"598,636 -> 598,442\n" +
			"263,42 -> 686,465";

	public static void main(String... args) {

		Map<AdventOfCodeUtil.Coordinate, Integer> map = new HashMap<>();

		for (int i = 0; i < input.split("\n").length; i++) {
			String str = input.split("\n")[i];
			Integer x1 = null;
			Integer x2 = null;
			Integer y1 = null;
			Integer y2 = null;
			for (int j = 0; j < str.split(" -> ").length; j++) {
				String str2 = str.split(" -> ")[j];
				if (j == 0) {
					x1 = AdventOfCodeUtil.getFirstNumberOfString(str2);
					y1 = AdventOfCodeUtil.getSecondNumberOfString(str2);
				}

				if (j == 1) {
					x2 = AdventOfCodeUtil.getFirstNumberOfString(str2);
					y2 = AdventOfCodeUtil.getSecondNumberOfString(str2);

					if (x1.equals(x2)) {

						if ( y1 > y2) {
							for (int inte : AdventOfCodeUtil.rangeInts(y2, y1, true)) {
								AdventOfCodeUtil.Coordinate coordinate2 = new AdventOfCodeUtil.Coordinate(x1, inte);
								if (map.containsKey(coordinate2)) {
									Integer value = map.get(coordinate2);
									map.put(coordinate2, value + 1);
								} else {
									map.put(coordinate2, 1);
								}
							}
						} else {
							for (int inte : AdventOfCodeUtil.rangeInts(y1, y2, true)) {
								AdventOfCodeUtil.Coordinate coordinate2 = new AdventOfCodeUtil.Coordinate(x1, inte);
								if (map.containsKey(coordinate2)) {
									Integer value = map.get(coordinate2);
									map.put(coordinate2, value + 1);
								} else {
									map.put(coordinate2, 1);
								}
							}
						}
					}

					else if (y1.equals(y2)) {

						if (x1 > x2) {
							for (int inte : AdventOfCodeUtil.rangeInts(x2, x1, true)) {
								AdventOfCodeUtil.Coordinate coordinate2 = new AdventOfCodeUtil.Coordinate(inte, y1);
								if (map.containsKey(coordinate2)) {
									Integer value = map.get(coordinate2);
									map.put(coordinate2, value + 1);
								} else {
									map.put(coordinate2, 1);
								}
							}
						} else {
							for (int inte : AdventOfCodeUtil.rangeInts(x1, x2, true)) {
								AdventOfCodeUtil.Coordinate coordinate2 = new AdventOfCodeUtil.Coordinate(inte, y1);
								if (map.containsKey(coordinate2)) {
									Integer value = map.get(coordinate2);
									map.put(coordinate2, value + 1);
								} else {
									map.put(coordinate2, 1);
								}
							}
						}
					} else {
						List<Integer> set1 = AdventOfCodeUtil.rangeIntsList(x1, x2 ,true);
						List<Integer> set2 = AdventOfCodeUtil.rangeIntsList(y1, y2 ,true);
						for (int k = 0; k < set1.size(); k++) {
							Integer w = set1.get(k);
							AdventOfCodeUtil.Coordinate coordinate = new AdventOfCodeUtil.Coordinate(w, set2.get(k));
							if (map.containsKey(coordinate)) {
								Integer value = map.get(coordinate);
								map.put(coordinate, value + 1);
							} else {
								map.put(coordinate, 1);
							}
						}
					}
				}
			}
		}
		System.out.println(map.values().stream().filter(u -> u > 1).count());
	}

}
