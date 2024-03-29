package adventofcode_2022;



import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdventOfCode_2022_07 {

    static String curPath = "";
    static String curRelPath = "";

    static Map<String, Object> files = new HashMap<>();

    static int totalDirs;
	static Map<String, Long> sizes = new HashMap<>();

    static String input = "$ cd /\n" +
            "$ ls\n" +
            "165965 cmwllbzl.jlm\n" +
            "68612 ggb.qgd\n" +
            "dir gwnwqcgq\n" +
            "dir pdlpwdp\n" +
            "211084 qgcn.rbj\n" +
            "dir sbps\n" +
            "179881 sdpjprfb.lsh\n" +
            "318082 tdhgd.lwf\n" +
            "dir wvdlv\n" +
            "$ cd gwnwqcgq\n" +
            "$ ls\n" +
            "dir btddw\n" +
            "310195 cqsblt.jwb\n" +
            "dir ggb\n" +
            "dir hhdfbj\n" +
            "dir hrj\n" +
            "dir mdhln\n" +
            "dir nwbndtgl\n" +
            "dir pjmc\n" +
            "dir rgb\n" +
            "dir sdpjprfb\n" +
            "169518 tbswl.btw\n" +
            "$ cd btddw\n" +
            "$ ls\n" +
            "315327 hjs.dcw\n" +
            "dir pjmc\n" +
            "99361 pmqmgjsw.rqn\n" +
            "$ cd pjmc\n" +
            "$ ls\n" +
            "227980 cfbfmprt\n" +
            "dir hml\n" +
            "310835 mmcrfwdr.sps\n" +
            "170798 rhgmnqz\n" +
            "dir sdpjprfb\n" +
            "178337 vphwlqqw.dlt\n" +
            "dir wnmh\n" +
            "dir zqcnhs\n" +
            "$ cd hml\n" +
            "$ ls\n" +
            "dir fjtwgcw\n" +
            "194693 ggb\n" +
            "175159 ldbhqdbd\n" +
            "dir mzthvdms\n" +
            "90811 qgbrczz.dhh\n" +
            "118942 qvfdwcpn.cmv\n" +
            "227596 rhgmnqz\n" +
            "dir tnvsdr\n" +
            "dir vplhff\n" +
            "$ cd fjtwgcw\n" +
            "$ ls\n" +
            "16046 gfr\n" +
            "277037 jwpzm.vhn\n" +
            "291671 trpvvs.zgh\n" +
            "$ cd ..\n" +
            "$ cd mzthvdms\n" +
            "$ ls\n" +
            "244911 cqsblt.jwb\n" +
            "37587 gplsqzr.nwn\n" +
            "313958 tqrz.wfd\n" +
            "$ cd ..\n" +
            "$ cd tnvsdr\n" +
            "$ ls\n" +
            "185961 qgbrczz.dhh\n" +
            "85515 wjgvlj.qcq\n" +
            "$ cd ..\n" +
            "$ cd vplhff\n" +
            "$ ls\n" +
            "dir trjdm\n" +
            "$ cd trjdm\n" +
            "$ ls\n" +
            "244126 nhv.vgt\n" +
            "795 vlnwhgsc.tzm\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd sdpjprfb\n" +
            "$ ls\n" +
            "dir htvgnrrl\n" +
            "$ cd htvgnrrl\n" +
            "$ ls\n" +
            "240529 cfbfmprt\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd wnmh\n" +
            "$ ls\n" +
            "dir gccwr\n" +
            "322372 qgbrczz.dhh\n" +
            "dir rlhn\n" +
            "184351 tpfzqcs\n" +
            "$ cd gccwr\n" +
            "$ ls\n" +
            "290656 tswtgpd.jsp\n" +
            "$ cd ..\n" +
            "$ cd rlhn\n" +
            "$ ls\n" +
            "208348 gfr\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd zqcnhs\n" +
            "$ ls\n" +
            "dir dtfrbzgn\n" +
            "dir phhdmp\n" +
            "11336 pjmc.jwv\n" +
            "5056 qgbrczz.dhh\n" +
            "$ cd dtfrbzgn\n" +
            "$ ls\n" +
            "132783 gbvcnv\n" +
            "dir ghbwbc\n" +
            "298563 pjmc\n" +
            "81684 sdpjprfb\n" +
            "$ cd ghbwbc\n" +
            "$ ls\n" +
            "dir zgvwrms\n" +
            "$ cd zgvwrms\n" +
            "$ ls\n" +
            "296919 tlm.rlb\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd phhdmp\n" +
            "$ ls\n" +
            "dir ggb\n" +
            "$ cd ggb\n" +
            "$ ls\n" +
            "316842 jrmgt.mqw\n" +
            "196423 qrb.hpd\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ggb\n" +
            "$ ls\n" +
            "108630 cqsblt.jwb\n" +
            "dir fdmst\n" +
            "216771 fzvcgf\n" +
            "135624 gfr\n" +
            "dir pdwln\n" +
            "dir sdpjprfb\n" +
            "$ cd fdmst\n" +
            "$ ls\n" +
            "dir gcq\n" +
            "20042 ldgpzcbr\n" +
            "dir nnp\n" +
            "dir pjmc\n" +
            "dir qng\n" +
            "dir sdpjprfb\n" +
            "$ cd gcq\n" +
            "$ ls\n" +
            "132662 lvg.jpb\n" +
            "$ cd ..\n" +
            "$ cd nnp\n" +
            "$ ls\n" +
            "229401 css.qfj\n" +
            "17421 pjmc.hgp\n" +
            "$ cd ..\n" +
            "$ cd pjmc\n" +
            "$ ls\n" +
            "317512 pjmc.qph\n" +
            "$ cd ..\n" +
            "$ cd qng\n" +
            "$ ls\n" +
            "241771 cvlnwltp\n" +
            "91504 qgbrczz.dhh\n" +
            "$ cd ..\n" +
            "$ cd sdpjprfb\n" +
            "$ ls\n" +
            "82422 sdpjprfb.ljt\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd pdwln\n" +
            "$ ls\n" +
            "dir sdpjprfb\n" +
            "$ cd sdpjprfb\n" +
            "$ ls\n" +
            "285618 ltfcmg.chw\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd sdpjprfb\n" +
            "$ ls\n" +
            "58655 cqsblt.jwb\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd hhdfbj\n" +
            "$ ls\n" +
            "2937 pslftrf.nqf\n" +
            "$ cd ..\n" +
            "$ cd hrj\n" +
            "$ ls\n" +
            "25769 bcpl.shg\n" +
            "dir dfdtszr\n" +
            "dir ggb\n" +
            "3722 hdwqmgwf\n" +
            "dir nssjjtp\n" +
            "300324 qrvtsrs\n" +
            "100487 rhgmnqz\n" +
            "dir sdpjprfb\n" +
            "dir tmdtrqsl\n" +
            "248216 tswtgpd.jsp\n" +
            "$ cd dfdtszr\n" +
            "$ ls\n" +
            "dir hfmnrlvj\n" +
            "dir plzr\n" +
            "dir zpspcph\n" +
            "$ cd hfmnrlvj\n" +
            "$ ls\n" +
            "237362 cqsblt.jwb\n" +
            "$ cd ..\n" +
            "$ cd plzr\n" +
            "$ ls\n" +
            "295398 bjw.nlg\n" +
            "$ cd ..\n" +
            "$ cd zpspcph\n" +
            "$ ls\n" +
            "87660 pjmc\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ggb\n" +
            "$ ls\n" +
            "dir jtpb\n" +
            "dir rsptqbh\n" +
            "$ cd jtpb\n" +
            "$ ls\n" +
            "249820 bfdl.jmv\n" +
            "dir dggzszwn\n" +
            "dir ggb\n" +
            "dir whms\n" +
            "$ cd dggzszwn\n" +
            "$ ls\n" +
            "233228 lrhwrh.mqm\n" +
            "$ cd ..\n" +
            "$ cd ggb\n" +
            "$ ls\n" +
            "dir tcrjcmq\n" +
            "88734 tsbggqvp.fjl\n" +
            "$ cd tcrjcmq\n" +
            "$ ls\n" +
            "36677 wfdtbgf.hft\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd whms\n" +
            "$ ls\n" +
            "dir ggb\n" +
            "dir pjmc\n" +
            "dir vtgcdprq\n" +
            "$ cd ggb\n" +
            "$ ls\n" +
            "dir sdpjprfb\n" +
            "$ cd sdpjprfb\n" +
            "$ ls\n" +
            "177878 jhbdqn\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd pjmc\n" +
            "$ ls\n" +
            "35345 swmcmqq.clm\n" +
            "$ cd ..\n" +
            "$ cd vtgcdprq\n" +
            "$ ls\n" +
            "293766 gfr\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd rsptqbh\n" +
            "$ ls\n" +
            "dir csvpjd\n" +
            "239634 fszzvprc.phh\n" +
            "240240 tswtgpd.jsp\n" +
            "dir zjvc\n" +
            "$ cd csvpjd\n" +
            "$ ls\n" +
            "218253 rndllvcd\n" +
            "$ cd ..\n" +
            "$ cd zjvc\n" +
            "$ ls\n" +
            "98002 cqsblt.jwb\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd nssjjtp\n" +
            "$ ls\n" +
            "63947 tswtgpd.jsp\n" +
            "$ cd ..\n" +
            "$ cd sdpjprfb\n" +
            "$ ls\n" +
            "dir cgczvvbg\n" +
            "30257 flbhswlb.ccd\n" +
            "dir qdqdv\n" +
            "dir vqhps\n" +
            "$ cd cgczvvbg\n" +
            "$ ls\n" +
            "dir bntjhfd\n" +
            "22048 ggb.jrv\n" +
            "142476 qgbrczz.dhh\n" +
            "dir rchlvjb\n" +
            "dir vfrrnf\n" +
            "164431 wjfll.zdw\n" +
            "$ cd bntjhfd\n" +
            "$ ls\n" +
            "217858 hpt.jll\n" +
            "$ cd ..\n" +
            "$ cd rchlvjb\n" +
            "$ ls\n" +
            "208149 qrdrwtfw.dbd\n" +
            "100353 vhs\n" +
            "$ cd ..\n" +
            "$ cd vfrrnf\n" +
            "$ ls\n" +
            "3071 jdz\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd qdqdv\n" +
            "$ ls\n" +
            "26265 nvtr.ndw\n" +
            "$ cd ..\n" +
            "$ cd vqhps\n" +
            "$ ls\n" +
            "288263 gfr\n" +
            "317973 gfvsbqc\n" +
            "284249 lqpwzz\n" +
            "dir njstt\n" +
            "dir rbhd\n" +
            "185897 vssw\n" +
            "$ cd njstt\n" +
            "$ ls\n" +
            "313561 jgq.mvw\n" +
            "110742 qgbrczz.dhh\n" +
            "$ cd ..\n" +
            "$ cd rbhd\n" +
            "$ ls\n" +
            "11259 cqsblt.jwb\n" +
            "dir gchzg\n" +
            "286309 ltfcmg.chw\n" +
            "dir qmsntzj\n" +
            "dir sdpjprfb\n" +
            "281719 srfgltg.nrz\n" +
            "83632 tswtgpd.jsp\n" +
            "141859 vrv.sll\n" +
            "dir vsg\n" +
            "dir wbqshdm\n" +
            "$ cd gchzg\n" +
            "$ ls\n" +
            "dir phnz\n" +
            "$ cd phnz\n" +
            "$ ls\n" +
            "212607 mdrgcdl.vfp\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd qmsntzj\n" +
            "$ ls\n" +
            "87958 gfr\n" +
            "$ cd ..\n" +
            "$ cd sdpjprfb\n" +
            "$ ls\n" +
            "110482 ggb.wnf\n" +
            "$ cd ..\n" +
            "$ cd vsg\n" +
            "$ ls\n" +
            "232499 sdpjprfb\n" +
            "$ cd ..\n" +
            "$ cd wbqshdm\n" +
            "$ ls\n" +
            "dir pjmc\n" +
            "$ cd pjmc\n" +
            "$ ls\n" +
            "273630 pjmc\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd tmdtrqsl\n" +
            "$ ls\n" +
            "139366 sqfj.hrg\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd mdhln\n" +
            "$ ls\n" +
            "dir bftszdgn\n" +
            "dir crhbc\n" +
            "dir ggb\n" +
            "dir jhmvgjrr\n" +
            "dir pjmc\n" +
            "dir sgpnzv\n" +
            "$ cd bftszdgn\n" +
            "$ ls\n" +
            "206539 cplch.dsb\n" +
            "201607 cqsblt.jwb\n" +
            "207839 gdz.plv\n" +
            "dir ggb\n" +
            "72021 ltfcmg.chw\n" +
            "dir nddh\n" +
            "106046 wvf.zvc\n" +
            "$ cd ggb\n" +
            "$ ls\n" +
            "242347 cqsblt.jwb\n" +
            "272603 ltfcmg.chw\n" +
            "273519 nrrz.dfj\n" +
            "5628 pjmc\n" +
            "$ cd ..\n" +
            "$ cd nddh\n" +
            "$ ls\n" +
            "243243 ltfcmg.chw\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd crhbc\n" +
            "$ ls\n" +
            "dir ccw\n" +
            "dir ggb\n" +
            "120001 ltfcmg.chw\n" +
            "dir pcqcswz\n" +
            "120308 qgbrczz.dhh\n" +
            "dir sscfn\n" +
            "dir vpsj\n" +
            "$ cd ccw\n" +
            "$ ls\n" +
            "dir fgghhg\n" +
            "dir pjmc\n" +
            "$ cd fgghhg\n" +
            "$ ls\n" +
            "238488 czpsmdm\n" +
            "150925 ggb\n" +
            "134050 qgbrczz.dhh\n" +
            "$ cd ..\n" +
            "$ cd pjmc\n" +
            "$ ls\n" +
            "138343 sdpjprfb.bmh\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ggb\n" +
            "$ ls\n" +
            "157435 rffmjwpm\n" +
            "dir sdpjprfb\n" +
            "dir tbd\n" +
            "dir zgmffgdz\n" +
            "$ cd sdpjprfb\n" +
            "$ ls\n" +
            "dir jwjpwbdj\n" +
            "$ cd jwjpwbdj\n" +
            "$ ls\n" +
            "88782 tswtgpd.jsp\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd tbd\n" +
            "$ ls\n" +
            "203640 vclsjppl.jws\n" +
            "$ cd ..\n" +
            "$ cd zgmffgdz\n" +
            "$ ls\n" +
            "203870 ggb\n" +
            "dir jhcrw\n" +
            "$ cd jhcrw\n" +
            "$ ls\n" +
            "70775 gfr\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd pcqcswz\n" +
            "$ ls\n" +
            "260246 zlwc.rnh\n" +
            "$ cd ..\n" +
            "$ cd sscfn\n" +
            "$ ls\n" +
            "75162 bjtwwgf\n" +
            "dir cfthmzh\n" +
            "265717 ggb\n" +
            "230679 gsbj.nzd\n" +
            "17708 ltfcmg.chw\n" +
            "dir pdgwcshp\n" +
            "dir ztrpvlbh\n" +
            "$ cd cfthmzh\n" +
            "$ ls\n" +
            "296793 chgws.qfd\n" +
            "187701 pjmc\n" +
            "29681 qgbrczz.dhh\n" +
            "$ cd ..\n" +
            "$ cd pdgwcshp\n" +
            "$ ls\n" +
            "dir cfbfmprt\n" +
            "dir lqbh\n" +
            "dir rrtpqd\n" +
            "$ cd cfbfmprt\n" +
            "$ ls\n" +
            "dir rwflz\n" +
            "$ cd rwflz\n" +
            "$ ls\n" +
            "33792 gtt.qcl\n" +
            "dir jrblfq\n" +
            "dir rldtppt\n" +
            "$ cd jrblfq\n" +
            "$ ls\n" +
            "224257 cqsblt.jwb\n" +
            "$ cd ..\n" +
            "$ cd rldtppt\n" +
            "$ ls\n" +
            "dir nzgg\n" +
            "$ cd nzgg\n" +
            "$ ls\n" +
            "139560 fhbw.vhm\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd lqbh\n" +
            "$ ls\n" +
            "dir mhdbp\n" +
            "dir nqsz\n" +
            "$ cd mhdbp\n" +
            "$ ls\n" +
            "dir ggb\n" +
            "28344 wtc.cfd\n" +
            "$ cd ggb\n" +
            "$ ls\n" +
            "dir hwdtp\n" +
            "220117 rvdpjmgt.szq\n" +
            "$ cd hwdtp\n" +
            "$ ls\n" +
            "288606 cqsblt.jwb\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd nqsz\n" +
            "$ ls\n" +
            "197106 dpjfbs.rvc\n" +
            "55173 pjl\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd rrtpqd\n" +
            "$ ls\n" +
            "178 pjmc\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ztrpvlbh\n" +
            "$ ls\n" +
            "201371 bhb.pmw\n" +
            "188328 ddqjnzvw.rdd\n" +
            "206451 tswtgpd.jsp\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd vpsj\n" +
            "$ ls\n" +
            "5614 cqsblt.jwb\n" +
            "300968 ctmdnwgt.pgj\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ggb\n" +
            "$ ls\n" +
            "dir ggb\n" +
            "14512 hzgq.tsb\n" +
            "302375 pjmc.tlj\n" +
            "dir thhgz\n" +
            "282216 zdsbj\n" +
            "dir zrzmb\n" +
            "$ cd ggb\n" +
            "$ ls\n" +
            "180980 brpqch.plw\n" +
            "42195 ltfcmg.chw\n" +
            "322227 qgbrczz.dhh\n" +
            "$ cd ..\n" +
            "$ cd thhgz\n" +
            "$ ls\n" +
            "74145 cfbfmprt.cmp\n" +
            "253851 gfr\n" +
            "272552 gsb\n" +
            "dir pgfqw\n" +
            "276958 tswtgpd.jsp\n" +
            "$ cd pgfqw\n" +
            "$ ls\n" +
            "193634 ggb.zjg\n" +
            "185688 qrml.bvv\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd zrzmb\n" +
            "$ ls\n" +
            "dir chjmbq\n" +
            "84603 gfr\n" +
            "dir rbms\n" +
            "253620 sbscbqg.jfg\n" +
            "$ cd chjmbq\n" +
            "$ ls\n" +
            "dir svmvlm\n" +
            "$ cd svmvlm\n" +
            "$ ls\n" +
            "251057 nhjwcjj.dgz\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd rbms\n" +
            "$ ls\n" +
            "72618 tswtgpd.jsp\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd jhmvgjrr\n" +
            "$ ls\n" +
            "189022 cqsblt.jwb\n" +
            "172682 djp.npm\n" +
            "dir gdfgtz\n" +
            "147256 ggb\n" +
            "dir ghv\n" +
            "dir pjmc\n" +
            "110715 rhgmnqz\n" +
            "dir sdpjprfb\n" +
            "dir tjlf\n" +
            "183342 tswtgpd.jsp\n" +
            "$ cd gdfgtz\n" +
            "$ ls\n" +
            "268771 cqsblt.jwb\n" +
            "190140 dgrwz\n" +
            "248802 sdpjprfb.dpw\n" +
            "$ cd ..\n" +
            "$ cd ghv\n" +
            "$ ls\n" +
            "dir ggb\n" +
            "dir npqbngg\n" +
            "304352 qzjtnr.qcf\n" +
            "dir sdpjprfb\n" +
            "$ cd ggb\n" +
            "$ ls\n" +
            "285635 ltfcmg.chw\n" +
            "dir vzfdbtg\n" +
            "$ cd vzfdbtg\n" +
            "$ ls\n" +
            "dir pqmb\n" +
            "$ cd pqmb\n" +
            "$ ls\n" +
            "219019 ggb.nmh\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd npqbngg\n" +
            "$ ls\n" +
            "dir cfbfmprt\n" +
            "242286 cqsblt.jwb\n" +
            "dir hrqfqpzr\n" +
            "dir nsnfq\n" +
            "dir rggzmfqm\n" +
            "dir wjdnwg\n" +
            "$ cd cfbfmprt\n" +
            "$ ls\n" +
            "34347 cqsblt.jwb\n" +
            "dir gpnzggqb\n" +
            "dir nvdqw\n" +
            "dir qdtcwm\n" +
            "dir ssgg\n" +
            "$ cd gpnzggqb\n" +
            "$ ls\n" +
            "dir pjmc\n" +
            "dir pqbf\n" +
            "dir qjpwm\n" +
            "192404 tswtgpd.jsp\n" +
            "88344 vdb.rzm\n" +
            "dir zjglfpt\n" +
            "$ cd pjmc\n" +
            "$ ls\n" +
            "dir pjmc\n" +
            "142330 psbppvhn\n" +
            "168892 qgbrczz.dhh\n" +
            "18858 vzzc.mtd\n" +
            "135911 zmjhz.tdv\n" +
            "$ cd pjmc\n" +
            "$ ls\n" +
            "197370 mlf\n" +
            "36218 nwq.njv\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd pqbf\n" +
            "$ ls\n" +
            "233005 gfr\n" +
            "$ cd ..\n" +
            "$ cd qjpwm\n" +
            "$ ls\n" +
            "129132 qqmrm.jrj\n" +
            "6309 tswtgpd.jsp\n" +
            "$ cd ..\n" +
            "$ cd zjglfpt\n" +
            "$ ls\n" +
            "186963 qgbrczz.dhh\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd nvdqw\n" +
            "$ ls\n" +
            "147955 fcgrqq\n" +
            "224829 gfr\n" +
            "$ cd ..\n" +
            "$ cd qdtcwm\n" +
            "$ ls\n" +
            "36443 ltfcmg.chw\n" +
            "$ cd ..\n" +
            "$ cd ssgg\n" +
            "$ ls\n" +
            "250574 jddfdj\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd hrqfqpzr\n" +
            "$ ls\n" +
            "143568 pjmc\n" +
            "dir sdpjprfb\n" +
            "dir shcrrpc\n" +
            "$ cd sdpjprfb\n" +
            "$ ls\n" +
            "88050 rhgmnqz\n" +
            "$ cd ..\n" +
            "$ cd shcrrpc\n" +
            "$ ls\n" +
            "dir pjmc\n" +
            "dir pwnnmpm\n" +
            "$ cd pjmc\n" +
            "$ ls\n" +
            "dir wbj\n" +
            "$ cd wbj\n" +
            "$ ls\n" +
            "196127 gfr\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd pwnnmpm\n" +
            "$ ls\n" +
            "dir cgghrf\n" +
            "dir rhgmnqz\n" +
            "dir vnbvq\n" +
            "$ cd cgghrf\n" +
            "$ ls\n" +
            "108742 lbpfnccl.mtj\n" +
            "$ cd ..\n" +
            "$ cd rhgmnqz\n" +
            "$ ls\n" +
            "89791 qgbrczz.dhh\n" +
            "$ cd ..\n" +
            "$ cd vnbvq\n" +
            "$ ls\n" +
            "48961 ltfcmg.chw\n" +
            "241813 qgbrczz.dhh\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd nsnfq\n" +
            "$ ls\n" +
            "dir tgdqz\n" +
            "$ cd tgdqz\n" +
            "$ ls\n" +
            "dir ggb\n" +
            "$ cd ggb\n" +
            "$ ls\n" +
            "dir rhgmnqz\n" +
            "$ cd rhgmnqz\n" +
            "$ ls\n" +
            "268661 cfbfmprt.tbl\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd rggzmfqm\n" +
            "$ ls\n" +
            "177501 qqn\n" +
            "55857 sdpjprfb.srj\n" +
            "$ cd ..\n" +
            "$ cd wjdnwg\n" +
            "$ ls\n" +
            "147729 lsjvsmsv\n" +
            "242095 pjmc\n" +
            "237172 sdpjprfb.cwf\n" +
            "dir sqh\n" +
            "203791 tswtgpd.jsp\n" +
            "dir zgfz\n" +
            "$ cd sqh\n" +
            "$ ls\n" +
            "44848 cfbfmprt\n" +
            "214010 cqsblt.jwb\n" +
            "175692 gfr\n" +
            "107978 lgsncr\n" +
            "$ cd ..\n" +
            "$ cd zgfz\n" +
            "$ ls\n" +
            "184114 cfbfmprt.gpf\n" +
            "207186 qgbrczz.dhh\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd sdpjprfb\n" +
            "$ ls\n" +
            "73238 hfbvz\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd pjmc\n" +
            "$ ls\n" +
            "210824 cqsblt.jwb\n" +
            "dir pllr\n" +
            "dir tqqjp\n" +
            "$ cd pllr\n" +
            "$ ls\n" +
            "dir fshjdzp\n" +
            "210365 ltfcmg.chw\n" +
            "dir rfbdg\n" +
            "96591 rhgmnqz.wbc\n" +
            "dir rzzwcb\n" +
            "123059 tswtgpd.jsp\n" +
            "dir zzcw\n" +
            "$ cd fshjdzp\n" +
            "$ ls\n" +
            "143719 sdpjprfb\n" +
            "$ cd ..\n" +
            "$ cd rfbdg\n" +
            "$ ls\n" +
            "242103 wllggqm.wcg\n" +
            "$ cd ..\n" +
            "$ cd rzzwcb\n" +
            "$ ls\n" +
            "dir rhgmnqz\n" +
            "$ cd rhgmnqz\n" +
            "$ ls\n" +
            "80525 cqsblt.jwb\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd zzcw\n" +
            "$ ls\n" +
            "260646 jtgzqh\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd tqqjp\n" +
            "$ ls\n" +
            "245089 vszrfcc\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd sdpjprfb\n" +
            "$ ls\n" +
            "7514 cfbfmprt.dvj\n" +
            "$ cd ..\n" +
            "$ cd tjlf\n" +
            "$ ls\n" +
            "dir pjmc\n" +
            "$ cd pjmc\n" +
            "$ ls\n" +
            "230234 cfbfmprt.mqf\n" +
            "197486 gfr\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd pjmc\n" +
            "$ ls\n" +
            "19935 fblsvg.btt\n" +
            "dir fgvv\n" +
            "dir ggb\n" +
            "222906 gjl.zrv\n" +
            "84255 jfqqjzbd\n" +
            "dir pjmc\n" +
            "$ cd fgvv\n" +
            "$ ls\n" +
            "94831 dgn\n" +
            "312078 tswtgpd.jsp\n" +
            "132961 vzbl.mnq\n" +
            "$ cd ..\n" +
            "$ cd ggb\n" +
            "$ ls\n" +
            "dir hfcr\n" +
            "310301 msdr.wnh\n" +
            "$ cd hfcr\n" +
            "$ ls\n" +
            "318041 dnp.lcn\n" +
            "dir mjrhdq\n" +
            "dir qwvfg\n" +
            "$ cd mjrhdq\n" +
            "$ ls\n" +
            "18541 ctrrm.ljc\n" +
            "247841 pjmc\n" +
            "$ cd ..\n" +
            "$ cd qwvfg\n" +
            "$ ls\n" +
            "128875 clvgmp.cvb\n" +
            "138276 cqsblt.jwb\n" +
            "26303 tswtgpd.jsp\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd pjmc\n" +
            "$ ls\n" +
            "106609 ltfcmg.chw\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd sgpnzv\n" +
            "$ ls\n" +
            "218397 ltfcmg.chw\n" +
            "233365 sdpjprfb.mfd\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd nwbndtgl\n" +
            "$ ls\n" +
            "dir fsdvzvvv\n" +
            "198516 sdpjprfb.shs\n" +
            "$ cd fsdvzvvv\n" +
            "$ ls\n" +
            "209527 ggb\n" +
            "dir llwbm\n" +
            "dir lzz\n" +
            "99039 msgsztv.hnq\n" +
            "104248 rhgmnqz\n" +
            "$ cd llwbm\n" +
            "$ ls\n" +
            "187895 ghr.crq\n" +
            "274721 qpr.gnm\n" +
            "dir qrrs\n" +
            "$ cd qrrs\n" +
            "$ ls\n" +
            "260559 mnmhqww\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd lzz\n" +
            "$ ls\n" +
            "dir tnmwncgl\n" +
            "dir wrjjmhz\n" +
            "$ cd tnmwncgl\n" +
            "$ ls\n" +
            "301449 hqz\n" +
            "$ cd ..\n" +
            "$ cd wrjjmhz\n" +
            "$ ls\n" +
            "145193 mdv\n" +
            "73533 zjwlt.vqf\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd pjmc\n" +
            "$ ls\n" +
            "40049 cqsblt.jwb\n" +
            "169928 gvwcdhvn\n" +
            "314117 qgbrczz.dhh\n" +
            "$ cd ..\n" +
            "$ cd rgb\n" +
            "$ ls\n" +
            "dir bvwn\n" +
            "57953 cqsblt.jwb\n" +
            "240228 fvdpqr.vdz\n" +
            "173344 ltfcmg.chw\n" +
            "dir pjmc\n" +
            "28301 sdpjprfb.qlh\n" +
            "$ cd bvwn\n" +
            "$ ls\n" +
            "dir cfbfmprt\n" +
            "dir fjmbvhh\n" +
            "dir ggb\n" +
            "dir pdgsf\n" +
            "dir sdpjprfb\n" +
            "$ cd cfbfmprt\n" +
            "$ ls\n" +
            "dir vndbzj\n" +
            "234044 zmlrt.zwb\n" +
            "$ cd vndbzj\n" +
            "$ ls\n" +
            "dir cfbfmprt\n" +
            "$ cd cfbfmprt\n" +
            "$ ls\n" +
            "dir ptzpcqh\n" +
            "$ cd ptzpcqh\n" +
            "$ ls\n" +
            "141535 cqsblt.jwb\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd fjmbvhh\n" +
            "$ ls\n" +
            "244287 gfr\n" +
            "146029 rhgmnqz.bsq\n" +
            "$ cd ..\n" +
            "$ cd ggb\n" +
            "$ ls\n" +
            "279627 tswtgpd.jsp\n" +
            "$ cd ..\n" +
            "$ cd pdgsf\n" +
            "$ ls\n" +
            "dir fjdlhn\n" +
            "21454 qncpwnsw.jnc\n" +
            "49920 sdpjprfb.mmp\n" +
            "318538 tswtgpd.jsp\n" +
            "$ cd fjdlhn\n" +
            "$ ls\n" +
            "dir rhgmnqz\n" +
            "$ cd rhgmnqz\n" +
            "$ ls\n" +
            "209357 wggmwlfm\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd sdpjprfb\n" +
            "$ ls\n" +
            "39774 rhgmnqz.wrv\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd pjmc\n" +
            "$ ls\n" +
            "115169 flhtvnq.gzc\n" +
            "147102 ltfcmg.chw\n" +
            "279604 rnn.cpc\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd sdpjprfb\n" +
            "$ ls\n" +
            "170481 rhgmnqz\n" +
            "48045 szgwfcl.tlh\n" +
            "110279 tnfdmgfl\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd pdlpwdp\n" +
            "$ ls\n" +
            "dir fwsbsprp\n" +
            "dir gjjjwznz\n" +
            "dir jzpwnpmc\n" +
            "dir qlvfslzp\n" +
            "dir sdpjprfb\n" +
            "59208 tswtgpd.jsp\n" +
            "$ cd fwsbsprp\n" +
            "$ ls\n" +
            "177666 rhczscsq.gmb\n" +
            "$ cd ..\n" +
            "$ cd gjjjwznz\n" +
            "$ ls\n" +
            "163647 cpft.fvj\n" +
            "60316 gfr\n" +
            "$ cd ..\n" +
            "$ cd jzpwnpmc\n" +
            "$ ls\n" +
            "dir cfbfmprt\n" +
            "dir gpd\n" +
            "46041 ltfcmg.chw\n" +
            "$ cd cfbfmprt\n" +
            "$ ls\n" +
            "16870 cqsblt.jwb\n" +
            "dir slj\n" +
            "$ cd slj\n" +
            "$ ls\n" +
            "291893 gdjb.rfv\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd gpd\n" +
            "$ ls\n" +
            "159168 qgbrczz.dhh\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd qlvfslzp\n" +
            "$ ls\n" +
            "dir clnms\n" +
            "102746 ggb.tth\n" +
            "35817 pjmc.hsc\n" +
            "dir sdpjprfb\n" +
            "296043 sgf.ssl\n" +
            "dir sqhbbsbj\n" +
            "134188 wbhbmbm.bpz\n" +
            "153495 zdjmnjt.smn\n" +
            "$ cd clnms\n" +
            "$ ls\n" +
            "dir ggb\n" +
            "$ cd ggb\n" +
            "$ ls\n" +
            "305684 rhgmnqz.bht\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd sdpjprfb\n" +
            "$ ls\n" +
            "29970 ghsjjc\n" +
            "$ cd ..\n" +
            "$ cd sqhbbsbj\n" +
            "$ ls\n" +
            "150243 pjmc.mzd\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd sdpjprfb\n" +
            "$ ls\n" +
            "dir cfbfmprt\n" +
            "dir qnhl\n" +
            "$ cd cfbfmprt\n" +
            "$ ls\n" +
            "dir ggb\n" +
            "$ cd ggb\n" +
            "$ ls\n" +
            "158203 jtcfv.mvc\n" +
            "dir qnqcb\n" +
            "$ cd qnqcb\n" +
            "$ ls\n" +
            "71245 cqsblt.jwb\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd qnhl\n" +
            "$ ls\n" +
            "dir sdpjprfb\n" +
            "$ cd sdpjprfb\n" +
            "$ ls\n" +
            "306685 cqsblt.jwb\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd sbps\n" +
            "$ ls\n" +
            "251286 cqsblt.jwb\n" +
            "dir pjmc\n" +
            "213946 rhgmnqz.nzh\n" +
            "13484 zhzslc.bvp\n" +
            "$ cd pjmc\n" +
            "$ ls\n" +
            "9892 tswtgpd.jsp\n" +
            "249059 wjb.rwq\n" +
            "$ cd ..\n" +
            "$ cd ..\n" +
            "$ cd wvdlv\n" +
            "$ ls\n" +
            "314303 qlbqgp.njq";

    public static void main(String... args) {
        long total = 0;

        for (int i = 0; i < input.split("\n").length; i++) {
            String ii = input.split("\n")[i];

            if (ii.startsWith("$ cd /")) {
                totalDirs += 1;
                curPath = "/";
            } else if (ii.startsWith("dir")) {
                totalDirs += 1;
				String dirname = ii.split("dir ")[1];

				if (curRelPath.equals("")) {
					Map<String, Object> dir = new HashMap<>();
					files.put(dirname, dir);
				} else {
					Map<String, Object> base = getBase(files);
					Map<String, Object> dir = new HashMap<>();
					base.put(dirname, dir);
				}
            } else if (ii.startsWith("$ cd")) {
                if (ii.contains("..")) {
                    curPath = curPath.substring(0, curPath.lastIndexOf("/"));
					curRelPath = curPath.substring(curPath.lastIndexOf("/") + 1);
				} else {
                    String dirTo = ii.split("cd ")[1];
                    if (curPath.endsWith("/")) {
                        curPath = curPath + dirTo;
                    } else {
                        curPath = curPath + "/" + dirTo;
                    }
                    curRelPath = dirTo;
                }
                continue;
            } else if (ii.startsWith("$ ls")) {

            } else {
                if (curRelPath.equals("")) {
                    long size = Long.parseLong(ii.split(" ")[0]);
                    String name = ii.split(" ")[1];
                    files.put(name, size);
                } else {
					Map<String, Object> base = getBase(files);
					long size = Long.parseLong(ii.split(" ")[0]);
					String name = ii.split(" ")[1];
					base.put(name, size);
				}
            }
        }
        walk("/", files);
        countmap(files);
		for (Map.Entry<String, Long> entry : sizes.entrySet()) {
			if (entry.getValue() <= 100000) {
				total += entry.getValue();
			}
		}
        long totalsize = sizes.get("/");
        long freesize = 70000000 - totalsize;
        long needed = 30000000 - freesize;

        long totalneed = 99999999;
        for (Map.Entry<String, Long> entry : sizes.entrySet()) {
            if (entry.getValue() > needed && entry.getValue() < totalneed) {
                totalneed = entry.getValue();
            }
        }

		System.out.println(needed);
    }

	static long walk(String name, Map<String, Object> dir) {
		long total = 0;
		for (Map.Entry<String, Object> entry : dir.entrySet()) {
			if (entry.getValue() instanceof Map) {
				total += walk(entry.getKey(), (Map)entry.getValue());
			} else {
				total += (Long)entry.getValue();
			}
		}
        if (sizes.containsKey(name)) {
            sizes.put(name + total, total);
        } else {
            sizes.put(name, total);
        }
		return total;
	}

    static long countmap(Map<String, Object> dir) {
        long total = 0;
        for (Map.Entry<String, Object> entry : dir.entrySet()) {
            if (entry.getValue() instanceof Map) {
                total += 1 + countmap((Map)entry.getValue());
            }
        }
        return total;
    }

	static Map<String, Object> getBase(Map<String, Object> filez) {
		for (String s: curPath.split("/")) {
			if (!s.equals("")) {
				filez = (Map<String, Object>) filez.get(s);
			}
		}
		return filez;
	}

}
