package adventofcode_2022;


import utils.AdventOfCodeUtil;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdventOfCode_2022_21 {
	static String input = "fgzt: lwpw * grjz\n" +
			"mrjw: 2\n" +
			"nzjc: 5\n" +
			"jhjg: 19\n" +
			"nwml: dljv * lchm\n" +
			"chls: dcdj * vwwr\n" +
			"fnvr: mrbs + scwf\n" +
			"nrnj: djqg + wtsc\n" +
			"hfcm: 9\n" +
			"wfpf: 2\n" +
			"wczj: 3\n" +
			"shtj: ctjp + tgcb\n" +
			"vqln: vmgw * nzbr\n" +
			"tcbw: 1\n" +
			"tbnf: qgqd * fcfj\n" +
			"schb: 2\n" +
			"djjl: tgbj + vzpl\n" +
			"hctq: 1\n" +
			"fjfl: 2\n" +
			"qwpp: qcvz * djgt\n" +
			"tbdr: wvnl - dwcw\n" +
			"tpzl: jwrd * zlhz\n" +
			"sgpd: pggf * gwdf\n" +
			"hwcz: qgjb + cvbl\n" +
			"ccfb: 2\n" +
			"srmf: crzb + nspz\n" +
			"hzzp: 1\n" +
			"tplj: jztf + zfrz\n" +
			"hvdh: 5\n" +
			"lzmr: 2\n" +
			"nllg: 11\n" +
			"tjht: 2\n" +
			"mhpt: 2\n" +
			"tmpj: 6\n" +
			"zzjv: njsq * dvcl\n" +
			"jdgt: 2\n" +
			"gjzs: bnpf * qgqf\n" +
			"wqdb: 5\n" +
			"wvwz: fhrt + wwmj\n" +
			"mrpr: frlg * ccbq\n" +
			"zlhz: bqwh + jfzm\n" +
			"btjh: 3\n" +
			"slcj: rtjq + lcsg\n" +
			"qrwr: 16\n" +
			"crzs: 4\n" +
			"cbjz: 3\n" +
			"gsgd: ssln + ddpc\n" +
			"zpdn: wzwq * dsgz\n" +
			"sswh: ngjl * rhsp\n" +
			"dddp: mmmv * zrsd\n" +
			"prwt: 7\n" +
			"nsrj: 5\n" +
			"dbfz: fnfr * lfrl\n" +
			"gbzz: htdl + lwdw\n" +
			"jvlm: cnfh + ndpr\n" +
			"ljmb: 10\n" +
			"mfgj: 2\n" +
			"vfpp: zwpz * cnsb\n" +
			"rwgf: 3\n" +
			"wlbn: tbzq * blbq\n" +
			"nftn: 11\n" +
			"dhdr: nlzl * hndd\n" +
			"trbj: fglw + wcrc\n" +
			"cwsc: 3\n" +
			"vgvj: prsc + vdfh\n" +
			"ddlg: 1\n" +
			"wnbh: 5\n" +
			"fqqz: 3\n" +
			"hcpj: 1\n" +
			"jqct: 3\n" +
			"flpb: 15\n" +
			"qbdz: tgzd * wpth\n" +
			"bfvn: rvsb * srnp\n" +
			"lgmt: fvpr + cqjc\n" +
			"qsbs: fvfg * lzgf\n" +
			"nwhf: 4\n" +
			"qqtv: rshj * cvfd\n" +
			"jmvn: 3\n" +
			"lbzh: 2\n" +
			"rzcw: bjns * fzst\n" +
			"jqnf: 3\n" +
			"qgqf: drbn * gdgr\n" +
			"hrnl: snzz - npdl\n" +
			"ljwb: 3\n" +
			"bcqz: shjh + dcnn\n" +
			"nbmd: 5\n" +
			"srbj: fbbf * qpdt\n" +
			"fbjq: 4\n" +
			"scwf: 4\n" +
			"jcpr: 15\n" +
			"tmgd: zrwl - qqtv\n" +
			"mcwt: tczf * rjdr\n" +
			"zmlm: 3\n" +
			"cnsb: 5\n" +
			"znts: 4\n" +
			"nzlr: zwdl * lwsq\n" +
			"jwtz: 12\n" +
			"jvst: 1\n" +
			"qptv: pqbp * jbfc\n" +
			"lntd: jjrv - dscg\n" +
			"tjrc: bcdv * gcwl\n" +
			"rjmg: 7\n" +
			"jztf: pmgn * fcph\n" +
			"mpfq: 8\n" +
			"tgmd: 2\n" +
			"shjg: 7\n" +
			"qdbg: jmfm + wbft\n" +
			"snzz: ntml * slcj\n" +
			"lrvf: 2\n" +
			"cjsd: vgpb * hjmc\n" +
			"ltvd: 3\n" +
			"fvsf: 20\n" +
			"bfsn: 11\n" +
			"czwf: qprz + hngp\n" +
			"ljqb: 4\n" +
			"hngg: tgnw * pqbc\n" +
			"wtnt: mvmc + bgmt\n" +
			"jbbc: qrdf * tqjs\n" +
			"jhmd: 4\n" +
			"cnfh: 5\n" +
			"fdgz: 2\n" +
			"mnvd: 2\n" +
			"ldrw: mgcq + tgjj\n" +
			"fbwn: fnzd * glsw\n" +
			"mmjg: fzqq / wlzl\n" +
			"wjvr: bszs + ccfb\n" +
			"drdr: fbmf + mbgj\n" +
			"vvsh: qcws * qwhd\n" +
			"vnhc: ljwd * cwzj\n" +
			"nlsn: 2\n" +
			"lvzp: 5\n" +
			"qsrr: 5\n" +
			"zdwf: hcfv - mvgq\n" +
			"hpvw: ghqn * hgch\n" +
			"dscg: jfcl * pdpt\n" +
			"hwqs: fpmg * vtbd\n" +
			"zmjv: sdbl + qgjm\n" +
			"snvc: pbwj * spbq\n" +
			"wpjn: ggqg + zflc\n" +
			"zdjm: 2\n" +
			"qfhm: 8\n" +
			"fzpc: sfbw + srbr\n" +
			"lshn: 5\n" +
			"fbwh: 6\n" +
			"mldw: cwlc + pjtv\n" +
			"jpvj: 5\n" +
			"gnwf: wvwz * dvtt\n" +
			"ctsw: 3\n" +
			"npzh: rmqm * jmrl\n" +
			"thnr: lsdp + mcwt\n" +
			"cnzt: swqc * tzvt\n" +
			"lzhl: nwtz + fnhz\n" +
			"ffzj: fvfp + spdz\n" +
			"qvsp: gdqj + fbwn\n" +
			"zctz: 2\n" +
			"tqbn: 12\n" +
			"wlpv: rrqw + gpcp\n" +
			"hmft: 2\n" +
			"vgsf: wggr * jqdp\n" +
			"sfqb: 5\n" +
			"pdps: nsrj * sqsg\n" +
			"lzgf: 19\n" +
			"npdl: jpjg * scjj\n" +
			"bcph: dnjs * jznp\n" +
			"bmmm: nfqq * lmfz\n" +
			"hfzd: 15\n" +
			"wngb: 2\n" +
			"trfc: 3\n" +
			"mzld: zwwr * msbh\n" +
			"rdrw: lmdf + hmbt\n" +
			"mgwg: 2\n" +
			"sgrr: llvl * wcgm\n" +
			"vcfl: 2\n" +
			"vqrr: 2\n" +
			"mlwq: 2\n" +
			"gnjl: wgsq + llmj\n" +
			"bmch: 3\n" +
			"cvfd: stzc - tzqz\n" +
			"lhbw: 14\n" +
			"bzhn: cblb + fmmw\n" +
			"zjgt: 17\n" +
			"tbsp: 2\n" +
			"hvbl: 4\n" +
			"lfwt: 6\n" +
			"vrst: mlhc * gnwb\n" +
			"lfsj: tllh * llmh\n" +
			"phvw: 5\n" +
			"nnps: zqws - qfvh\n" +
			"vnlh: 2\n" +
			"lbbc: zmjt + wqhn\n" +
			"dflp: 3\n" +
			"tcfl: 3\n" +
			"lcqm: nsjg + mzsj\n" +
			"wwdw: ltvd * pwjs\n" +
			"gfdv: 4\n" +
			"wglp: rcrp * gpwb\n" +
			"wggr: 2\n" +
			"mtjn: cdlg * dljt\n" +
			"vctw: rzvn * hmlg\n" +
			"ftlz: 2\n" +
			"wvcs: 11\n" +
			"mcgh: thnr * fhjr\n" +
			"rcht: dhsg * jhwz\n" +
			"gltc: 5\n" +
			"rtsb: 2\n" +
			"crnw: 4\n" +
			"vrbh: 3\n" +
			"thrg: lrrg + zrjs\n" +
			"zdqp: 5\n" +
			"gqsp: nbds * hgst\n" +
			"bhdc: qvmn * bqdl\n" +
			"wbvc: 2\n" +
			"htqq: 3\n" +
			"sgzq: shdt * lfwt\n" +
			"pqbg: mdfn + qczc\n" +
			"zlsz: zdmq * gwgf\n" +
			"gqsr: vbzr * nvpt\n" +
			"zcsq: 14\n" +
			"tfgw: tcnr * rnvz\n" +
			"jpsj: nbmd * gcgg\n" +
			"cczj: bwdm + dfgz\n" +
			"tbnn: 3\n" +
			"qdnb: 11\n" +
			"cdmm: 3\n" +
			"cjlb: mgvr * fvcs\n" +
			"hcdv: 4\n" +
			"flfq: 2\n" +
			"zdbm: 4\n" +
			"blvz: 4\n" +
			"btnj: 3\n" +
			"whsz: 2\n" +
			"jpnd: grht - jcfg\n" +
			"grjz: 10\n" +
			"tprv: 7\n" +
			"wtmc: mlbb + pthg\n" +
			"nlfl: 11\n" +
			"nzss: 3\n" +
			"frfl: lzjq * rsfb\n" +
			"pwjs: wbmz + mzld\n" +
			"bfts: hjmf * jtzm\n" +
			"bzmt: 7\n" +
			"nbds: 5\n" +
			"dztv: 2\n" +
			"mzwc: 2\n" +
			"jppn: vgwc + qvsp\n" +
			"wjhh: 8\n" +
			"jlgg: qqmq / cbjz\n" +
			"lbzm: nhmf - qfhm\n" +
			"fqcl: zfpj * mzwl\n" +
			"fdjv: 4\n" +
			"vrdq: wwzj * gdpp\n" +
			"gtmm: wrwr * vnvg\n" +
			"vlfn: 3\n" +
			"dtdw: 2\n" +
			"bszs: jfvc * bscq\n" +
			"chvj: 3\n" +
			"zfbs: pbwm - cdln\n" +
			"ctrq: ttbp * fqld\n" +
			"fcpv: dtvv * bclj\n" +
			"gqll: hbrv + lgdv\n" +
			"ctjp: 7\n" +
			"snqw: ffhv * bfwm\n" +
			"dvtt: rlmf + nztz\n" +
			"tzws: 20\n" +
			"vwfn: 2\n" +
			"cwgj: 5\n" +
			"qtjq: qqst * jhrr\n" +
			"cwgf: 3\n" +
			"mrfh: gmgr + mzgq\n" +
			"wvnl: ccqb + gctz\n" +
			"btcr: wbqs + qcqv\n" +
			"gfjr: 2\n" +
			"dbsr: 5\n" +
			"jdmq: ctrq + cpmh\n" +
			"sdtq: dnjn - mlmp\n" +
			"fbtr: flpb * mgbr\n" +
			"mpgw: 5\n" +
			"tvlf: 11\n" +
			"bzmr: 1\n" +
			"qwfb: pngp * qtjq\n" +
			"mqss: tjvn * vhht\n" +
			"jqdp: wvqg + thzm\n" +
			"mnwh: 15\n" +
			"qvbv: ffqd * fnjq\n" +
			"rqgb: ddhd / clvj\n" +
			"thhw: gsmw * ldrw\n" +
			"pfvc: 3\n" +
			"sgmz: 2\n" +
			"fdcp: 2\n" +
			"rctj: 17\n" +
			"brgl: 2\n" +
			"pgtd: 2\n" +
			"fqth: wqgl - rznp\n" +
			"fzst: 2\n" +
			"cdqz: jcpl / vwhq\n" +
			"pcwg: hshm * ntdm\n" +
			"zdmf: 7\n" +
			"trht: 3\n" +
			"nhsb: scbg + vjfw\n" +
			"tzlw: jpwp * jscr\n" +
			"hbrv: bzbr * wshb\n" +
			"dvtn: lhqc / mgwg\n" +
			"qgnh: 2\n" +
			"crwj: gfmv * djjp\n" +
			"thgn: flwb + lrvh\n" +
			"ddss: gjfm * smnp\n" +
			"ttlc: jgnm * wcbj\n" +
			"qrfq: vpsv + smct\n" +
			"tlgn: 2\n" +
			"fsqn: 4\n" +
			"rqdq: 3\n" +
			"dlpr: 2\n" +
			"jpqm: hsbd + mnvp\n" +
			"qjmv: nlnv * clgf\n" +
			"snpf: 5\n" +
			"wjnl: 2\n" +
			"drzl: bqsv + gjwt\n" +
			"hbnt: nllg * jntf\n" +
			"qbsq: nftn + zcsq\n" +
			"lfzz: 1\n" +
			"hhmg: dsfc * lbnq\n" +
			"ghsw: 5\n" +
			"hwcg: snnf * nsdn\n" +
			"wsfq: 8\n" +
			"vsts: 2\n" +
			"blmn: 3\n" +
			"fhdp: zmtw * cljf\n" +
			"qrlb: scsc + spnt\n" +
			"wrgh: mvfb * jwgv\n" +
			"vbdr: 16\n" +
			"jjcm: 16\n" +
			"jvzs: lrvf * vsnw\n" +
			"fsnt: rqvd + vwjf\n" +
			"wrbn: llmr + fpzn\n" +
			"ddjw: vmfl - bfvn\n" +
			"zqws: 9\n" +
			"blvr: wjns + hffv\n" +
			"ncjl: 3\n" +
			"rzqz: chdn + wzwj\n" +
			"tsfn: 3\n" +
			"drns: jfnz + zjsw\n" +
			"jwgv: cppp * zctz\n" +
			"prqf: vcqp * ftlz\n" +
			"glpd: 16\n" +
			"slwj: jwcl * lmwg\n" +
			"whzh: 2\n" +
			"vljz: 5\n" +
			"rnvz: 2\n" +
			"zzgd: bnlt + ltgv\n" +
			"rlfw: 2\n" +
			"tmzq: bvrp + pcwg\n" +
			"dqtb: crwj + scqr\n" +
			"tvgj: tmzs * vvbq\n" +
			"bncm: 13\n" +
			"rshj: 4\n" +
			"jpjg: 3\n" +
			"ghnr: jwrb + jdlr\n" +
			"lmdf: 5\n" +
			"drbd: gpss * jpvj\n" +
			"csml: qdlm * tprv\n" +
			"bzrz: pqnw * qhdr\n" +
			"hvvs: 6\n" +
			"hgrd: nrnj + qdbg\n" +
			"fqtw: rvdt + vnhc\n" +
			"wgpl: vzsp + ztqj\n" +
			"fsjw: bqww - jsgn\n" +
			"zcdr: mqsb + sswh\n" +
			"bvhz: gvtp * lpsq\n" +
			"pgtl: fchh / tzrf\n" +
			"rtfz: stqt * tdzt\n" +
			"ltqb: 6\n" +
			"rcsd: jhjg + gmmf\n" +
			"srlb: 3\n" +
			"zhhf: 3\n" +
			"dppp: 13\n" +
			"sdsc: 1\n" +
			"gmgr: mzwc * rhww\n" +
			"fqbs: dbcb * ddww\n" +
			"ttsm: 2\n" +
			"wjlt: 5\n" +
			"rszf: cwgj * cwbm\n" +
			"zdwt: 2\n" +
			"tqlb: 2\n" +
			"wqdw: zsvl - fsvm\n" +
			"szsh: 17\n" +
			"vwwr: 2\n" +
			"jfvc: 17\n" +
			"qvvw: cwbn - hqtc\n" +
			"tlvm: trbr + cmtt\n" +
			"cppp: 3\n" +
			"jrqd: mjcw + zfff\n" +
			"vbnw: 4\n" +
			"mvtw: vbsn + gjmr\n" +
			"fnzd: 2\n" +
			"ffsz: 3\n" +
			"zlsr: chvf - wrbn\n" +
			"qrbv: gplm * dlgz\n" +
			"zvgb: sjst * vnqm\n" +
			"mddj: 2\n" +
			"cwbm: 2\n" +
			"zvhw: 6\n" +
			"sjlb: vjhl * zmnw\n" +
			"mplm: tnwl + qfbm\n" +
			"wfrw: 2\n" +
			"hwnf: vqph + bzmr\n" +
			"zrrq: hwhq * msww\n" +
			"jvsj: fbfb * lnmw\n" +
			"wzwj: 4\n" +
			"jfnz: lwhr + fbls\n" +
			"qhzq: wfhb * gwfb\n" +
			"jqhs: zpjc + fqqz\n" +
			"hvdn: ppbn * rzfd\n" +
			"plvh: 6\n" +
			"wtrd: lcjn + jlgg\n" +
			"ccqs: 17\n" +
			"mstm: 2\n" +
			"bgfh: 3\n" +
			"plqt: 5\n" +
			"wjvt: 17\n" +
			"mqdr: 2\n" +
			"gtbm: sqcq * jlzd\n" +
			"jqps: 3\n" +
			"hcqp: 6\n" +
			"tfwd: 2\n" +
			"rgvd: 8\n" +
			"pggf: 3\n" +
			"tpsg: tzdt - dvrg\n" +
			"gmll: jcdc * ztbh\n" +
			"dvcl: nrrg + wrqq\n" +
			"twpn: jzcz + vbnw\n" +
			"mflw: pqdl * dqvd\n" +
			"qzgt: qmjf + hwmz\n" +
			"sctl: 5\n" +
			"zvsf: wlhz * ccvj\n" +
			"rlvq: 5\n" +
			"spnt: mqdt + qcpr\n" +
			"rrgb: 19\n" +
			"gfqr: 3\n" +
			"zhth: mvjf * dsbl\n" +
			"ncfh: 2\n" +
			"rmgz: phls * tqlb\n" +
			"ljts: vdhj + dngw\n" +
			"fvhs: 2\n" +
			"jmrl: btvd * bgsm\n" +
			"jlhm: 17\n" +
			"phdd: sgdj + wfwb\n" +
			"qtln: jqnf * vbjd\n" +
			"flgh: ztjv + ddlc\n" +
			"mqlg: 6\n" +
			"gtpw: 12\n" +
			"nsdn: 14\n" +
			"wbqs: bzzn + srbm\n" +
			"lnmw: 2\n" +
			"ldvg: 1\n" +
			"rgzd: vrhf * jvwr\n" +
			"qmnn: mssh * drnz\n" +
			"qvmn: 16\n" +
			"tzld: 4\n" +
			"jjqz: vvsh + jhhr\n" +
			"wfhb: 5\n" +
			"sdfd: 4\n" +
			"tlqp: 1\n" +
			"nnqc: 5\n" +
			"hhzw: 2\n" +
			"jvpw: ztlw + hswb\n" +
			"pzpl: 3\n" +
			"bgrg: qpcn * clpp\n" +
			"mzgq: lsgc * jppn\n" +
			"vbjd: 4\n" +
			"rlrg: 2\n" +
			"vqzj: wbnd + zvsf\n" +
			"bcrq: qbmr * wfsf\n" +
			"zjnt: vdcz * nnps\n" +
			"mnvp: tbfd - rgvd\n" +
			"wtdd: nfwh * lfmv\n" +
			"wtdm: 5\n" +
			"dtvv: glww + pznc\n" +
			"wzgc: bmch * fdhw\n" +
			"qjtv: 3\n" +
			"gvsw: 2\n" +
			"vtnc: sscd + whqz\n" +
			"flqs: jwmm + vfqj\n" +
			"slmc: 2\n" +
			"qqmn: hvrt + tfdb\n" +
			"sjrd: 2\n" +
			"rsfb: 3\n" +
			"lrlp: 6\n" +
			"cwzj: 3\n" +
			"lgnm: 10\n" +
			"mngb: 7\n" +
			"vbrl: 4\n" +
			"fpfg: 3\n" +
			"nmhp: 10\n" +
			"qsrn: rmmn + brgz\n" +
			"jwrb: hnvg + wfsp\n" +
			"wqgl: 15\n" +
			"jcdc: 3\n" +
			"lnpj: 2\n" +
			"jmmb: 2\n" +
			"mmmv: sswv + jdwj\n" +
			"gczv: qmlg * pqtb\n" +
			"lrfj: hvwp * qrgs\n" +
			"qztl: 5\n" +
			"dfwj: 6\n" +
			"rdjr: hlcz + lzmb\n" +
			"vnhg: 14\n" +
			"nlrf: pqvh - rmqp\n" +
			"ztlw: chhz + nsrd\n" +
			"dpzb: ldzw + jcwc\n" +
			"bdqh: ppnc * rlvq\n" +
			"qzwn: cgqz * pvvr\n" +
			"cvmb: 10\n" +
			"dfcr: 2\n" +
			"wmvr: 2\n" +
			"zqnb: 2\n" +
			"rsll: bjzd * gdtv\n" +
			"qqnz: zfgn * crll\n" +
			"ppbn: 5\n" +
			"blpj: 2\n" +
			"hgcj: 19\n" +
			"wgsq: vdnr * jlqc\n" +
			"ljmm: 4\n" +
			"scnb: 3\n" +
			"dbjv: qfwp * dmbc\n" +
			"wrwr: nnnv * nltn\n" +
			"fvbf: qlwq * wbsh\n" +
			"rzrn: jwsf * vvvt\n" +
			"lhqc: rpqr * hwcz\n" +
			"vvvt: 13\n" +
			"rqbf: lpph + mzpl\n" +
			"bjzd: thbc * vppj\n" +
			"fmmr: whjj - tpql\n" +
			"lfqm: bncn - zmdb\n" +
			"zmgq: chcz - fmbg\n" +
			"zdzf: pqfl + zdwf\n" +
			"ntdm: 17\n" +
			"lhtn: gvsw * nbpj\n" +
			"ffqd: 3\n" +
			"jhhr: lnsd * sdfd\n" +
			"rzvn: 2\n" +
			"vlzp: qjhs * snpf\n" +
			"cnmh: bfpz + zblh\n" +
			"qszn: vmnb + bchg\n" +
			"sjfv: 5\n" +
			"fbmd: 5\n" +
			"hgrq: wsdz * wrlr\n" +
			"pqtz: 2\n" +
			"dtmw: nnmr * dvtn\n" +
			"qwsv: jwft * qdfn\n" +
			"vjfw: crjv * jzmf\n" +
			"wlzl: 2\n" +
			"twjr: ljhb - hwcg\n" +
			"dmbc: bmmm - lbtz\n" +
			"zsvl: zwjf + ggjq\n" +
			"cttr: 2\n" +
			"vqph: cpbm + dbhw\n" +
			"bqwr: hjwq - wlzw\n" +
			"tmnm: 1\n" +
			"fcfj: 2\n" +
			"rwsm: mpfq + nwnj\n" +
			"qjtz: 1\n" +
			"tdzt: 3\n" +
			"mhpj: 13\n" +
			"zjjz: bbwh + qsbs\n" +
			"jcnj: bzgd / dlpr\n" +
			"dsfl: 4\n" +
			"rwsc: vdfj * jcts\n" +
			"mssh: 2\n" +
			"bfwm: vwms + bgrg\n" +
			"njsq: 2\n" +
			"hqjd: 2\n" +
			"qdrj: 2\n" +
			"nscv: 2\n" +
			"tdns: 3\n" +
			"mqqw: wgrw * ghqf\n" +
			"mvnb: dqgf * ndgh\n" +
			"ztjj: 2\n" +
			"tzdt: wpdw / zmpt\n" +
			"fnjq: 3\n" +
			"qfjp: tshp + fcpv\n" +
			"bscq: 3\n" +
			"pqfl: cjdv * nmzl\n" +
			"ttcv: nlsn * jghn\n" +
			"twhn: lpmp * hcvg\n" +
			"mdpq: 2\n" +
			"cbzh: dsfs * pfvc\n" +
			"wtsc: lzhl + vbhz\n" +
			"pmlf: szvq / pfdh\n" +
			"gdzb: mvnb + mblj\n" +
			"cqhm: 11\n" +
			"dqvd: 3\n" +
			"jtzf: 18\n" +
			"cdvl: 2\n" +
			"gdtv: ldhz / jhhl\n" +
			"wjjn: 3\n" +
			"dsfc: 7\n" +
			"jcwc: sgzn + wpjn\n" +
			"zgtf: fhlg * gpwr\n" +
			"sdff: 7\n" +
			"hhgw: bpfm + sgvw\n" +
			"nrgp: fdwp * phnc\n" +
			"thvn: gblh * wzrw\n" +
			"dnfz: pcml - dhvq\n" +
			"hvgh: gtzv * zzbl\n" +
			"tllh: 2\n" +
			"nzbj: 2\n" +
			"nwtn: 5\n" +
			"gjmr: 4\n" +
			"swqc: 5\n" +
			"rlmf: 2\n" +
			"tfqc: dcql * bfrv\n" +
			"fvpr: brdv - cnrs\n" +
			"lfmv: 2\n" +
			"crll: 2\n" +
			"dsgz: fgbv * scnb\n" +
			"bgvj: hghn + qbbj\n" +
			"lrcd: lcgs + gqsr\n" +
			"dpzc: gbtg * jpmn\n" +
			"qlzt: 2\n" +
			"sgzn: brbw * hwgc\n" +
			"fbls: 8\n" +
			"nclm: 9\n" +
			"nwlg: lhtn - vrsd\n" +
			"lwpd: 3\n" +
			"fddh: 5\n" +
			"vhnp: jvnh + zvwq\n" +
			"qzvz: 11\n" +
			"hwmz: cvvl + rplr\n" +
			"dngw: 4\n" +
			"qqwj: 8\n" +
			"rdbb: 4\n" +
			"pcgl: dvdq + zpvh\n" +
			"mmcd: 2\n" +
			"rmqp: 19\n" +
			"mvmc: 17\n" +
			"djgt: bwtd + qrlh\n" +
			"nghz: gdpg + dldc\n" +
			"rqvd: fqmv * gfqr\n" +
			"wvqg: qwfb + lgmt\n" +
			"hnvg: zjsp * zqhw\n" +
			"rqcn: gvpr * hjzl\n" +
			"slmm: 6\n" +
			"hvwp: 2\n" +
			"pvzs: 13\n" +
			"gslv: 3\n" +
			"rhww: hbqn + cdqs\n" +
			"wnmz: tmnm + vtnz\n" +
			"wwzj: 5\n" +
			"hcll: rhrr * drns\n" +
			"prrp: tmzq * nswp\n" +
			"tpgm: twhn + vhng\n" +
			"whbn: 12\n" +
			"hghn: sfcz * jrfv\n" +
			"zrfz: vshr + qwsv\n" +
			"vcbm: 2\n" +
			"qtjg: brgl + qztl\n" +
			"ljbw: tjtz * rqdq\n" +
			"tvmd: 6\n" +
			"mppm: fhlp * nsmz\n" +
			"nnmr: 2\n" +
			"sdwv: sgrr + hctq\n" +
			"bbwc: 4\n" +
			"ncpr: jrvd - qwbz\n" +
			"wjgl: 20\n" +
			"fjsh: 8\n" +
			"jjvh: 2\n" +
			"svrj: 2\n" +
			"wgrw: 2\n" +
			"vjlb: 17\n" +
			"nttp: cbjm * cgmt\n" +
			"sqcq: 3\n" +
			"rvmr: zvrr * vwfn\n" +
			"jvcq: lhbp + lshn\n" +
			"gpwb: hhgw + wzfc\n" +
			"qbbj: mqrg / twdj\n" +
			"rzfd: 2\n" +
			"vcbf: qgtv + mrzr\n" +
			"gwfb: jjzm + tlrd\n" +
			"fjlf: dnqc + clmw\n" +
			"pbwm: 12\n" +
			"trvq: hqqj + vsvg\n" +
			"nswp: 2\n" +
			"qjvm: 2\n" +
			"qldz: wctr - gmrn\n" +
			"pbql: 7\n" +
			"pvsc: wgpl * hbjm\n" +
			"mbnl: 3\n" +
			"pcpc: mhrw * bwft\n" +
			"nwch: fhpt * htqq\n" +
			"gqsn: 10\n" +
			"tshp: vgsf * blpj\n" +
			"tbcl: 6\n" +
			"wzwq: nbwq + blvr\n" +
			"nsnn: 7\n" +
			"shdt: tdns * jpfc\n" +
			"ntpm: 7\n" +
			"jmbh: 4\n" +
			"jvcn: wrdc + tcbw\n" +
			"djqg: nlmn + wwpc\n" +
			"qgnn: 4\n" +
			"chcz: 10\n" +
			"ccvj: 4\n" +
			"cnsd: 5\n" +
			"hrjw: 3\n" +
			"znzc: 19\n" +
			"ggqg: 9\n" +
			"gvsl: rtrq + vtpw\n" +
			"rthz: ltqb * zzwm\n" +
			"tjvn: 2\n" +
			"fjmq: 2\n" +
			"bgmt: 5\n" +
			"mlbm: 2\n" +
			"pqbc: 2\n" +
			"cqjz: 1\n" +
			"mrzr: 2\n" +
			"cmdw: lvfr * cmqn\n" +
			"ncsl: 3\n" +
			"fbrq: 3\n" +
			"nftc: 12\n" +
			"vlwd: lprc * rvwv\n" +
			"zzbm: bgvj + tnll\n" +
			"bdtj: 12\n" +
			"llmh: 4\n" +
			"rzmw: 2\n" +
			"vdfj: 3\n" +
			"wtjh: 1\n" +
			"dwcw: wzvv * vcbm\n" +
			"nzcg: pdbv * sscz\n" +
			"jflc: rrst * mwwj\n" +
			"spdz: ghsw + rbmq\n" +
			"cnpp: 5\n" +
			"sdbl: znbh * hgcj\n" +
			"fbjv: 8\n" +
			"lngl: zqbc + rcgh\n" +
			"ctfw: jvst + jvlh\n" +
			"qhzm: cbnc + bvqs\n" +
			"hqgd: lmtw * hbvj\n" +
			"qssh: ttcv + snsq\n" +
			"cwlc: nzgb + hlgd\n" +
			"mgsg: 6\n" +
			"cjcf: zjwl * zfbs\n" +
			"vnqm: 2\n" +
			"wqtl: 8\n" +
			"scst: 16\n" +
			"bclj: scst + zmrt\n" +
			"nqrv: zjjz - wtqb\n" +
			"vzqs: 3\n" +
			"wzfc: ggjd * srlb\n" +
			"cscd: zlsr + qqvc\n" +
			"dtmt: 2\n" +
			"dqmj: 2\n" +
			"gmmf: pqst * twdn\n" +
			"fmqr: mpgw + mqtm\n" +
			"llcf: 2\n" +
			"wfsp: btjh * nfmm\n" +
			"vwhl: 4\n" +
			"hzjs: lwtc * cmnc\n" +
			"wbft: czds * bncm\n" +
			"rglv: lwrf + vwsf\n" +
			"lzft: 2\n" +
			"cgqm: 3\n" +
			"zvhr: 3\n" +
			"nzsf: 8\n" +
			"rsdz: 12\n" +
			"ntfz: 2\n" +
			"dvwg: pzrm + bhnz\n" +
			"bhnz: 5\n" +
			"cmsg: dtsq * rnpg\n" +
			"wljn: mqdr * spln\n" +
			"zwpz: 11\n" +
			"cnmp: wzpg + dshr\n" +
			"gmds: rfds * hppw\n" +
			"gftn: 3\n" +
			"wbsh: trqs + pwpw\n" +
			"fpzh: 1\n" +
			"bgcm: gldw / dgrv\n" +
			"nztz: 5\n" +
			"mrhf: 1\n" +
			"sqsg: 3\n" +
			"dcql: 2\n" +
			"hnhm: 2\n" +
			"wbmz: zdzf - flqs\n" +
			"jcts: 17\n" +
			"vqrs: fznm + szsh\n" +
			"zpqz: 7\n" +
			"dljv: 3\n" +
			"qgmj: lbbc / nzjc\n" +
			"sjgq: dqhj + dgvb\n" +
			"rjqb: gnqt + tbnf\n" +
			"dqfr: lszh + mqvs\n" +
			"vlfb: qjvm + hbrb\n" +
			"gnsv: gtdj + lnhh\n" +
			"mzvs: 3\n" +
			"ndrt: rglv * bcjp\n" +
			"vvsg: 12\n" +
			"hlhw: fqcl - mrjw\n" +
			"zfvg: llwq + ldvg\n" +
			"hmwz: cqch + sdgp\n" +
			"fpmh: 15\n" +
			"wdjg: 3\n" +
			"dcdj: 4\n" +
			"gbng: 8\n" +
			"glww: frcp - cqjz\n" +
			"fjml: 2\n" +
			"zzvh: 2\n" +
			"vwjf: 2\n" +
			"tjtz: qqfm * tcsd\n" +
			"bpbb: 7\n" +
			"sbnr: wnqb - qftz\n" +
			"tjcv: jghw - tmpj\n" +
			"dvtb: 4\n" +
			"rwtc: 3\n" +
			"thbc: 2\n" +
			"ldbf: shpm * mddj\n" +
			"wmwq: 11\n" +
			"jjgq: 8\n" +
			"wqmt: 2\n" +
			"vzpl: mnwh + dzzp\n" +
			"rcgh: 6\n" +
			"gglj: bzhn * tcfc\n" +
			"pqzp: qvbv + zhth\n" +
			"gtjw: 2\n" +
			"pbjl: 5\n" +
			"jghn: ghvc + rvbt\n" +
			"vrgc: fmqp * lwpd\n" +
			"bsgt: gjlp * hvjf\n" +
			"ltrc: fwjt * rqnq\n" +
			"rvnh: hrjw * sgfv\n" +
			"mwwj: 5\n" +
			"njhm: fcfv * wjnl\n" +
			"fcfv: 16\n" +
			"gtdj: flht * mlwq\n" +
			"sscd: snqw * gcwj\n" +
			"pfsv: 3\n" +
			"bvrp: shdv * vffp\n" +
			"tzqz: qtfs * tvmn\n" +
			"qqhh: jcjj * fmpt\n" +
			"dvwd: 2\n" +
			"jdlr: 4\n" +
			"cpmh: brvd * hwsw\n" +
			"wlvq: 4\n" +
			"drqd: 5\n" +
			"sdgp: tdmw / wlcb\n" +
			"lzjq: 7\n" +
			"chdn: 3\n" +
			"tcsd: 5\n" +
			"rqnq: 5\n" +
			"pqcd: 4\n" +
			"dzpb: nrmd * pmlf\n" +
			"lhmj: hpcz - hvbl\n" +
			"mmcl: 11\n" +
			"sswv: mmll + zlvf\n" +
			"zbrv: mgsr + btcr\n" +
			"qlvw: 2\n" +
			"vbsn: svrj * nfqv\n" +
			"wlzw: rqnr * nsrf\n" +
			"zmdq: jdgt * rhbn\n" +
			"lzbs: hngg + cdtn\n" +
			"zfff: whzh + dfdb\n" +
			"nfwh: jvpw + qqhh\n" +
			"dvdq: gwfh * dvpd\n" +
			"gchs: rzmr * dhvn\n" +
			"qprz: trvl * tscz\n" +
			"cvhw: 5\n" +
			"wlbr: vwhl * qdml\n" +
			"dbtd: smrr * fprd\n" +
			"vzfh: 19\n" +
			"hqqj: njhm + jdpw\n" +
			"fhqb: vmld / hmlh\n" +
			"fmcl: 11\n" +
			"srtg: lhbw / vmpj\n" +
			"srwf: 3\n" +
			"vnpf: qhzq / htwn\n" +
			"ghvc: jzgm * zzll\n" +
			"sdhz: bdtj * rqnn\n" +
			"rhlg: bfzw * hhqg\n" +
			"bzbr: hptm * mmcl\n" +
			"vmlr: gqwq * zhzg\n" +
			"qhdr: fhqb * dvvw\n" +
			"ljnw: 2\n" +
			"jvjf: nllv - cfjh\n" +
			"jzmf: rvmr - srtp\n" +
			"rjfc: djtl * vvrs\n" +
			"zwsf: 3\n" +
			"zblh: gwbm / fnhh\n" +
			"jfcl: 3\n" +
			"hbfq: 2\n" +
			"rhnt: 2\n" +
			"zmnw: 3\n" +
			"qldh: gjnv * vbvw\n" +
			"mjtb: 16\n" +
			"rgqh: 2\n" +
			"tdpg: 13\n" +
			"hcvg: sldm + thgn\n" +
			"tgnw: wmvr * jrdv\n" +
			"fmmw: vzfz + tlqp\n" +
			"hgbs: tqbn * lqww\n" +
			"qqdl: 18\n" +
			"fdfr: 3\n" +
			"mlmp: 1\n" +
			"qjbh: hfcm * ftjd\n" +
			"mvmj: gctm * whbn\n" +
			"qlwq: 16\n" +
			"vhgb: 2\n" +
			"jwgl: ljts * wzfv\n" +
			"bgfv: qghw * mmss\n" +
			"mdfn: hbzs * gtbm\n" +
			"sjvs: 17\n" +
			"wvbz: 2\n" +
			"dfdb: 17\n" +
			"wctr: tzlw * wffn\n" +
			"lcgs: svhb / ztjj\n" +
			"bjbf: 12\n" +
			"cncs: 3\n" +
			"zqbc: 1\n" +
			"rvbt: tlnm + fcbr\n" +
			"qszc: 4\n" +
			"vcsv: hfjf + mqqw\n" +
			"jbhc: gtbj + bnhr\n" +
			"nztp: 7\n" +
			"cnrm: lspf - pfsv\n" +
			"mfvr: 5\n" +
			"zzbl: 19\n" +
			"zrfd: zmlm * nqlj\n" +
			"jwcn: fsrf + vzqs\n" +
			"nrpb: 2\n" +
			"tqjc: mfgj + vbzt\n" +
			"pglw: 2\n" +
			"fvcl: 5\n" +
			"vhng: sdhz + jflc\n" +
			"wgbd: cdfc * mplm\n" +
			"bpjz: pfjn * whlb\n" +
			"whjj: bmpz + tlwh\n" +
			"srhq: 4\n" +
			"pqst: 2\n" +
			"cbnc: rszs * qlzt\n" +
			"szvq: jgcg * cdvl\n" +
			"wfsf: 3\n" +
			"wrqq: bcqz * vwbn\n" +
			"hcqs: rfvc * mscg\n" +
			"jsgn: 8\n" +
			"nfsl: blvz + vlrj\n" +
			"bggm: zjrw * rwsc\n" +
			"gvpr: 2\n" +
			"gtfs: nwmg + gsgd\n" +
			"pwpv: wlfl + hfmp\n" +
			"jltd: jzpt + lbcm\n" +
			"mntb: rgdg - rzmw\n" +
			"fnhz: tbnz * bpbb\n" +
			"mwwf: cjlb + mtjn\n" +
			"cgnz: 2\n" +
			"tpsn: 6\n" +
			"bbhm: 16\n" +
			"pqjw: rqgb * jpmd\n" +
			"pcml: bvdf * lfnl\n" +
			"pwpw: 2\n" +
			"cjmt: 3\n" +
			"rbmq: bbgp * nlwb\n" +
			"wjns: 5\n" +
			"jjqq: wtnt + fvhh\n" +
			"jmdp: blbw * csml\n" +
			"tgcb: fmmr / fqff\n" +
			"ffjw: qvpl * wmwq\n" +
			"humn: ?\n" +
			"ngjl: 2\n" +
			"swwz: rzrn * sjlc\n" +
			"pvbs: 2\n" +
			"hfqz: 3\n" +
			"mbgj: vnml / pzpl\n" +
			"dcrc: 5\n" +
			"slmn: 2\n" +
			"pjtj: fhqq + qzfr\n" +
			"ldnm: 3\n" +
			"lwnc: mvvr * nbwt\n" +
			"zpjc: 20\n" +
			"lmfz: qgmj + cjsd\n" +
			"bnhr: wrgh + vbdr\n" +
			"gcwl: svpj * ncsl\n" +
			"ljwd: 3\n" +
			"rvlr: 5\n" +
			"fdft: wglp + vqln\n" +
			"bpfm: 1\n" +
			"zcpz: rgzj * gbdb\n" +
			"zmrt: 7\n" +
			"tzrf: 3\n" +
			"fdwp: rvlr * wgdv\n" +
			"rgpp: vlnm * wczh\n" +
			"qgtv: 5\n" +
			"wqhn: fzpc + hwqs\n" +
			"cwmr: 4\n" +
			"nsrd: ltrc + blgt\n" +
			"cdfc: qcbf * zdbm\n" +
			"clpp: 2\n" +
			"qqvc: jcnj + prrp\n" +
			"brvd: 4\n" +
			"vwbn: 3\n" +
			"lmtw: chdw + jfwq\n" +
			"vdfh: jwgl + vdwc\n" +
			"pnlp: bsvl * mwvm\n" +
			"shjh: 17\n" +
			"cnrs: dvtb * qsqm\n" +
			"dbnw: qmnn - vjgb\n" +
			"mgcq: 6\n" +
			"jhmz: 5\n" +
			"tmzs: vdzg / hnbj\n" +
			"qqcb: zvnj + qzvz\n" +
			"jrvd: srmf * qnzm\n" +
			"vlrj: prfb + mrhf\n" +
			"tsdt: 4\n" +
			"mbtp: 2\n" +
			"lchm: 4\n" +
			"dcgz: 4\n" +
			"fvcs: 2\n" +
			"zsql: 2\n" +
			"dshr: 5\n" +
			"dzzp: 3\n" +
			"grbp: zjgt + fvsf\n" +
			"tsrs: jwcn + mncn\n" +
			"cdjz: wtdm + scvs\n" +
			"fnhh: 5\n" +
			"fdff: 5\n" +
			"htls: 2\n" +
			"wcrc: vljd + bttt\n" +
			"jcpl: sddd * qvfs\n" +
			"zvnj: flfq * wqdw\n" +
			"dfnr: dlfh / cvld\n" +
			"lnsd: 17\n" +
			"cbtb: 2\n" +
			"sptb: 3\n" +
			"gvjc: bfts + ltln\n" +
			"tjnj: hmft * dsqp\n" +
			"fvfg: 2\n" +
			"sscz: 15\n" +
			"rdvd: 3\n" +
			"wpth: 2\n" +
			"mqsb: bzrz / llcf\n" +
			"brlj: 8\n" +
			"hhqg: 4\n" +
			"nbpj: 5\n" +
			"zmzl: 9\n" +
			"gplm: 2\n" +
			"vwhq: 4\n" +
			"pbwj: 11\n" +
			"srbm: 2\n" +
			"rjdr: 2\n" +
			"ndzg: hbpc * rffm\n" +
			"pqbp: stdt + qbsq\n" +
			"bwqb: hqhl * twpn\n" +
			"pdgr: lczz * tgng\n" +
			"fvzd: 13\n" +
			"qpmh: bbwc * qgnh\n" +
			"gshj: ppqj - qpmh\n" +
			"fcph: 5\n" +
			"jwzh: fdff * hplf\n" +
			"blbq: 2\n" +
			"qnzd: 4\n" +
			"dbhw: 15\n" +
			"zprj: 4\n" +
			"tgsq: 2\n" +
			"rcrp: qdbv + crnw\n" +
			"srhg: dcrb + ldwt\n" +
			"tlrd: dvwg * vfht\n" +
			"fngv: 4\n" +
			"gwfh: pcpc + snvc\n" +
			"mpsp: wbfd + gftn\n" +
			"gsmw: dngp + rwsm\n" +
			"fhqq: zwsf * qthv\n" +
			"vwsf: 3\n" +
			"cbnf: 1\n" +
			"bvfd: 11\n" +
			"qvfs: 6\n" +
			"jtzm: wbdp * fvhs\n" +
			"sllm: dcrc * wljn\n" +
			"tpfj: 6\n" +
			"fmvr: 4\n" +
			"rmqm: dvlz + nrsc\n" +
			"slps: fjmq * jqhs\n" +
			"rffm: wfpf * sjgq\n" +
			"rzmr: 2\n" +
			"hbzs: fddh * wjjn\n" +
			"fphq: vlzp + jmdp\n" +
			"gpqw: 5\n" +
			"cdlz: jvjr + vhtl\n" +
			"vsvg: bhnr * rszf\n" +
			"hmlg: 4\n" +
			"qvrl: qpmj * btdf\n" +
			"stqt: 3\n" +
			"zmpt: wczj + sptb\n" +
			"fqld: 3\n" +
			"mqtm: lpnd + tjht\n" +
			"ncjq: 19\n" +
			"hhbg: 14\n" +
			"pfdh: 2\n" +
			"vmpj: 2\n" +
			"gpwr: rlhd - bvsr\n" +
			"lpph: mflw - mhpt\n" +
			"msnd: vtnc / jqlz\n" +
			"qjfn: qqcb + lfqm\n" +
			"jhrr: 14\n" +
			"nlmn: gltc * sqhd\n" +
			"drjw: 2\n" +
			"smnp: 2\n" +
			"bhrz: 3\n" +
			"zrpq: 11\n" +
			"vvrs: 3\n" +
			"mgsr: 4\n" +
			"fqmv: 3\n" +
			"dhvn: 3\n" +
			"nslj: 2\n" +
			"rqsg: flgh * hvzd\n" +
			"mfnj: rpnd + vzhs\n" +
			"btwp: qdcd * lrcd\n" +
			"wqbm: wvbz * bmtd\n" +
			"wftp: 3\n" +
			"hwgc: 3\n" +
			"ntml: fwgq + cbmr\n" +
			"whqz: fjml * fznj\n" +
			"rpqr: 2\n" +
			"jwrd: 3\n" +
			"lmcm: qndt / qdgc\n" +
			"nchq: 2\n" +
			"dbbr: msnd - hgbs\n" +
			"rmqz: 2\n" +
			"pscc: vscm + gsmh\n" +
			"mqdt: wmdw * bgfh\n" +
			"bnpf: wlvp / vhgb\n" +
			"lnpc: fbjv * sjrd\n" +
			"ndgh: 17\n" +
			"mzwl: 3\n" +
			"zhcb: rsqc * cwsc\n" +
			"bqfz: qpvl + qrfq\n" +
			"jrwb: 5\n" +
			"gldw: jltd + zzjv\n" +
			"cdqb: bjbd + sbnr\n" +
			"lhfj: 3\n" +
			"jfbd: 11\n" +
			"ghdl: 3\n" +
			"pdbg: zjcr * wrvb\n" +
			"qdbv: 3\n" +
			"ccdn: 4\n" +
			"brgz: zmgq * vgtf\n" +
			"dvpd: 17\n" +
			"hgzw: 1\n" +
			"qzzb: wsfq * drdr\n" +
			"qbmr: 3\n" +
			"jvjr: ltzp * rjfv\n" +
			"lqbt: wnmf + lvct\n" +
			"hmlh: 2\n" +
			"wlhm: 2\n" +
			"nwdc: tvns * rfwd\n" +
			"tzvt: 7\n" +
			"pdsm: 2\n" +
			"qpvl: hqcg + bpbl\n" +
			"wrlr: 18\n" +
			"vzwq: dqtb * tzhj\n" +
			"vvbq: 3\n" +
			"spbq: 2\n" +
			"lmwg: 2\n" +
			"wcbj: 5\n" +
			"tmqv: 5\n" +
			"tvns: pgtl - hmql\n" +
			"fhlp: 6\n" +
			"smct: ddpp * dwmq\n" +
			"dtdc: grtn * fzds\n" +
			"vrhf: 7\n" +
			"jgfh: 10\n" +
			"rrst: 2\n" +
			"fhqm: zqfb + mldw\n" +
			"pzrm: 2\n" +
			"bjns: 8\n" +
			"vrgz: fbrq * vlqh\n" +
			"dfrp: 3\n" +
			"ffvb: 2\n" +
			"hptm: 7\n" +
			"wzsn: 3\n" +
			"bvhh: qhqc * crts\n" +
			"rmmn: dcgz * lnpc\n" +
			"rgdt: plvh * wwdw\n" +
			"pdgl: nztp * hzrn\n" +
			"lswd: 4\n" +
			"mzpl: 16\n" +
			"cvsr: tcbh + jpqm\n" +
			"gjzd: jfzn * cgnz\n" +
			"nspz: qdnb * nbgr\n" +
			"vvtg: srhg + qpdl\n" +
			"rfvc: 12\n" +
			"vdzm: vqrr * lhmj\n" +
			"bbsw: 2\n" +
			"zlrj: 2\n" +
			"gsfq: lvgd * rgzd\n" +
			"hwhq: rzqz * fvnd\n" +
			"rtjq: cnpp + hgzw\n" +
			"vmgw: 2\n" +
			"dqhj: thhw + pjtj\n" +
			"hjbn: tpzl * nttp\n" +
			"jfzn: hfzd + wljq\n" +
			"fzjb: cbzz + cftr\n" +
			"vpsv: cscd / gtjw\n" +
			"cgpq: pjcr + tbdr\n" +
			"wdnf: hhzw * fmms\n" +
			"mbhl: 3\n" +
			"pqdl: 3\n" +
			"jqjg: 5\n" +
			"zrsd: 2\n" +
			"mlbb: 4\n" +
			"snnf: 2\n" +
			"wlcb: 2\n" +
			"jpmd: dghl + btnj\n" +
			"hddf: vwds + fhrp\n" +
			"hgdw: 17\n" +
			"bhpr: 3\n" +
			"bbwh: fqbs + bjdn\n" +
			"gmgm: sdwv * vrdq\n" +
			"rtpp: wfrw * mtwj\n" +
			"zjrw: 7\n" +
			"trbr: 4\n" +
			"lhqr: fjsh * mjbv\n" +
			"pwzw: tfwt / nbts\n" +
			"fwgq: 1\n" +
			"stdt: vrbh * nvwn\n" +
			"gzsc: rpct + nzlr\n" +
			"zjwh: 3\n" +
			"ddpp: bfmp * dzsc\n" +
			"ztbh: 3\n" +
			"shdb: 2\n" +
			"sclj: 4\n" +
			"jdwj: ddlg + dgzl\n" +
			"zbnw: 1\n" +
			"mdhv: 13\n" +
			"dcnn: rlfw * zzbm\n" +
			"frbn: fqln + dfcr\n" +
			"qpdw: mnvd * hfnc\n" +
			"bbnc: wjmh - ldbf\n" +
			"fgfz: zbrv * zflr\n" +
			"llqq: 4\n" +
			"qhsp: 2\n" +
			"lrvh: 13\n" +
			"djht: 6\n" +
			"ghqf: hlzm - rscb\n" +
			"fmpt: 3\n" +
			"rnwh: humn - qpdw\n" +
			"fzpl: 2\n" +
			"pdpt: bbmh + mwwf\n" +
			"ddlc: ndzg * cdlz\n" +
			"fchh: nhsb + pwzw\n" +
			"tcdd: 3\n" +
			"stfd: 2\n" +
			"lsgc: bbnc + fjmw\n" +
			"rszs: 11\n" +
			"sgfv: 9\n" +
			"qvpl: 5\n" +
			"vzrt: ngps + vlwd\n" +
			"dqsq: cbzh + jvzs\n" +
			"hlgd: tnlv * ljnw\n" +
			"gdqj: 2\n" +
			"sqpc: 19\n" +
			"vdpv: bgtn + zprj\n" +
			"dmsp: 2\n" +
			"vmnb: gchs * jtzf\n" +
			"rgpw: wdjg + bbps\n" +
			"vfqj: vjqc + nwml\n" +
			"rszr: 4\n" +
			"prfb: 6\n" +
			"ldhz: grbp - dhtr\n" +
			"tgbj: tgmd * rhsn\n" +
			"twzw: rcht + pszh\n" +
			"cjmf: nmpz + hmwz\n" +
			"tgjj: 1\n" +
			"ggjd: 2\n" +
			"rwvp: 3\n" +
			"qndt: mbvv / ljwb\n" +
			"vpch: fmvr * gwzb\n" +
			"pjqw: fpzh + mvtw\n" +
			"wrdc: 7\n" +
			"djtl: sttq + hmcm\n" +
			"lwpw: tttg + bsmg\n" +
			"mrsz: cdmm + tfgw\n" +
			"qqmq: dbjv + qssh\n" +
			"zjcr: 8\n" +
			"mwdf: 6\n" +
			"sfbw: nwls - vfbg\n" +
			"rhsp: ndzq + hjqp\n" +
			"zvrr: fmnm + bvfd\n" +
			"jwsf: 3\n" +
			"mljs: 4\n" +
			"wjmh: zvgb + frfl\n" +
			"vgpb: hnzn - vmhw\n" +
			"tvmn: 3\n" +
			"jcbn: 16\n" +
			"mvgq: nlrf / nrps\n" +
			"qfvh: 1\n" +
			"hgsg: 3\n" +
			"hjmf: dmdd * tdsb\n" +
			"jjzm: 8\n" +
			"wphb: 2\n" +
			"pqtb: vnpf * qlvw\n" +
			"cftr: 1\n" +
			"lnhh: cvsr + gnjl\n" +
			"mchf: 2\n" +
			"jvvm: 11\n" +
			"vwms: ctfw + bjbf\n" +
			"gblh: 3\n" +
			"dvgt: pftp / qhsp\n" +
			"cdqs: hcrv * czwf\n" +
			"pzln: gznp * vlns\n" +
			"ppnc: 5\n" +
			"gcwr: rjhl * rwmf\n" +
			"qmvm: wjvr * shwp\n" +
			"ccbq: 5\n" +
			"gcgg: 15\n" +
			"zwjb: 13\n" +
			"vzfz: 5\n" +
			"jwcl: gzcg + jvsj\n" +
			"fdqr: 2\n" +
			"zfmj: 5\n" +
			"dnjs: pptw + ljmb\n" +
			"vjgb: dfrp * fmcl\n" +
			"pdvc: 4\n" +
			"wnqb: jlwl * dqmj\n" +
			"mnzf: 8\n" +
			"lspf: fzpl * jgfh\n" +
			"jwmm: thvn + bbhm\n" +
			"bhnr: 10\n" +
			"flht: jvlm * ggvn\n" +
			"wsdz: ljgd - fnvr\n" +
			"frlg: cvhw * mfpf\n" +
			"vwds: 2\n" +
			"qmsm: 8\n" +
			"qmlg: 4\n" +
			"rjhl: cttr + qghb\n" +
			"zsln: 13\n" +
			"wczh: srbt * fczr\n" +
			"jpwp: 13\n" +
			"mmfp: hqgd * rjtp\n" +
			"nrrf: 2\n" +
			"hlcz: wqbm * cjhm\n" +
			"rfrz: jjqq + ljqb\n" +
			"zmjt: vmlr + rdjr\n" +
			"scbg: mvmj + tvgj\n" +
			"pmgn: 2\n" +
			"bcjp: 2\n" +
			"szgm: dpzc + npzh\n" +
			"qcws: 5\n" +
			"qhqc: 19\n" +
			"ggjz: 15\n" +
			"prsc: wzjd + vfjl\n" +
			"jpfc: 2\n" +
			"rdgm: 13\n" +
			"dcfb: 14\n" +
			"rznp: 4\n" +
			"mhcs: zcpb - mzpq\n" +
			"mgvr: 17\n" +
			"lqww: 2\n" +
			"phls: qzwn / tvmd\n" +
			"hpcz: sfqb * flcf\n" +
			"crgp: 2\n" +
			"lfrl: tdff + btwp\n" +
			"clmw: fhqm * qldh\n" +
			"whlb: 2\n" +
			"hplf: mppm + cggl\n" +
			"qcbf: 5\n" +
			"jjcn: 2\n" +
			"trjj: grmp * zjwh\n" +
			"gtcr: qrwr + rqbf\n" +
			"bchg: pwwt / lcqm\n" +
			"ddjl: rjfc / bfqh\n" +
			"vhht: brfp + nnqc\n" +
			"wfdw: 4\n" +
			"jlwl: crgp * ljmm\n" +
			"tmjw: 7\n" +
			"mmss: 4\n" +
			"vscm: gbng * vrgc\n" +
			"zvdp: 2\n" +
			"llvl: 2\n" +
			"nmst: 15\n" +
			"djjp: rdng * vljz\n" +
			"qsqm: 3\n" +
			"ftjd: 3\n" +
			"pjtv: lnpj * pcfh\n" +
			"mfpf: 5\n" +
			"nvsn: 3\n" +
			"jgcg: tfqc + jbhc\n" +
			"mbzf: rrtd * fsnt\n" +
			"smrr: 7\n" +
			"wzjf: 5\n" +
			"lrrg: jwzh * cczm\n" +
			"jzpt: mrtg * lgzl\n" +
			"qpdt: 2\n" +
			"mlhc: gfdg * zrfz\n" +
			"dzvl: fdjv + prvb\n" +
			"vdnr: 2\n" +
			"snhn: 6\n" +
			"vtbd: 3\n" +
			"jjrv: lbzh * wtrd\n" +
			"fhjr: 2\n" +
			"fmmn: zzwq + lfzz\n" +
			"fvql: 7\n" +
			"dlzc: qhdt + lbsl\n" +
			"fhrp: 5\n" +
			"vshr: wvzc / mngb\n" +
			"nzgb: tbsj * wnbh\n" +
			"tfwt: bpjz - sllm\n" +
			"lwtc: 3\n" +
			"jqlz: 2\n" +
			"tcnr: 13\n" +
			"zmdb: 2\n" +
			"dhrt: rwps * vzrt\n" +
			"llmj: wzjm * qmsm\n" +
			"jvlh: wjhh * hqvt\n" +
			"jgnm: 2\n" +
			"dnqz: dhdr + qsrn\n" +
			"zlvf: shdb * dwhc\n" +
			"gctz: mnzs * mrsz\n" +
			"jlqc: mgbq + msmz\n" +
			"bjdn: pbql + qvjf\n" +
			"trzn: 2\n" +
			"vzwb: 3\n" +
			"rvsb: 5\n" +
			"qlrt: vmqm * ggjz\n" +
			"bvqs: 1\n" +
			"gcwj: 2\n" +
			"jlgs: 9\n" +
			"bqsv: mbhl * rwvp\n" +
			"gpcp: 5\n" +
			"bqdl: 2\n" +
			"vgmn: 4\n" +
			"lhbp: 2\n" +
			"hhsm: ntfz * cczj\n" +
			"cmnc: 9\n" +
			"dmdd: 8\n" +
			"dfmw: qswz + nlfl\n" +
			"qqjb: 2\n" +
			"zcdb: mldl + mzvt\n" +
			"bgtn: 9\n" +
			"drbn: 4\n" +
			"gdzt: frtn * hszr\n" +
			"glsw: qjmv / nchq\n" +
			"hngp: shqb + rcgn\n" +
			"dmtc: 5\n" +
			"lrwt: dqfr * gzsc\n" +
			"dnqc: nfmq + zqzg\n" +
			"shzl: 4\n" +
			"sstr: 8\n" +
			"fhlg: 4\n" +
			"pdch: 3\n" +
			"qpdl: nrgp / chvj\n" +
			"jscr: mmfp + vzwq\n" +
			"pthg: 7\n" +
			"zwqm: mhnn * gnjf\n" +
			"wfwb: 11\n" +
			"qrdf: sdff * gfjr\n" +
			"gdpg: 5\n" +
			"fmms: 4\n" +
			"jbfc: 2\n" +
			"qgbd: 8\n" +
			"gcfl: 3\n" +
			"pftp: ccdn + qrbv\n" +
			"jhhl: 2\n" +
			"wbdp: 3\n" +
			"rvns: 2\n" +
			"bbmh: qchv * nwhf\n" +
			"zfrz: gmll * nsnn\n" +
			"mthr: tpsn + vzfh\n" +
			"wbfd: 4\n" +
			"hgch: 6\n" +
			"lvfr: 12\n" +
			"nhmf: nwch * trzn\n" +
			"tbzq: bvhh + fbtr\n" +
			"vlnm: trfc * tqzr\n" +
			"qqfm: 5\n" +
			"fznj: nstv * zqlr\n" +
			"ssrg: 2\n" +
			"cdzr: 3\n" +
			"vffp: 5\n" +
			"hshm: 3\n" +
			"grmp: 3\n" +
			"nzdw: 5\n" +
			"nqlj: qjfn / wzsn\n" +
			"thdv: rnqp + wprs\n" +
			"vgwc: 1\n" +
			"mgbr: 3\n" +
			"qfwp: 2\n" +
			"mvfb: 6\n" +
			"nzgf: tjnj + mhpj\n" +
			"qrlh: dcfb / wtpq\n" +
			"pnwg: jqjg * mjtb\n" +
			"hfjf: cmdw + zpdn\n" +
			"ssln: fpfg * qvrl\n" +
			"nlwb: bqbd * ncjl\n" +
			"vcqp: 3\n" +
			"hjwq: cswd * tjrc\n" +
			"rvwv: 2\n" +
			"mhrw: 3\n" +
			"mgbq: npfq * zcbb\n" +
			"prbt: stdw + zcdr\n" +
			"sjlc: mmtw + zdwt\n" +
			"dhsg: dvwd + hvvs\n" +
			"nbwt: 13\n" +
			"ghqn: tlvm * lflv\n" +
			"hllh: 2\n" +
			"czds: 2\n" +
			"nsjg: 2\n" +
			"hmql: qqdl + trvq\n" +
			"tqcm: bwqb + phdd\n" +
			"sthb: zmjv * bncr\n" +
			"tdmw: ddss * pwmq\n" +
			"jzgm: 15\n" +
			"ztqj: 9\n" +
			"sjst: 11\n" +
			"tgzd: 9\n" +
			"gwdf: 4\n" +
			"jfwq: mchf * lzpm\n" +
			"zwdl: 2\n" +
			"tfhw: 3\n" +
			"qzfr: qlzv * mbzf\n" +
			"root: wgbd = rqsg\n" +
			"nqhh: 3\n" +
			"mblj: bvhz + nzgf\n" +
			"vppj: 9\n" +
			"qcqv: 2\n" +
			"wpvg: 2\n" +
			"hbrb: 15\n" +
			"vvdq: zrfd + fbmd\n" +
			"mqwv: 3\n" +
			"jcvc: 3\n" +
			"scsc: phvw + qvqw\n" +
			"gmrn: lvsj / gqsn\n" +
			"pngp: wjqg * tmjw\n" +
			"vdhj: 3\n" +
			"cjdv: 16\n" +
			"gctm: mqfd + rctj\n" +
			"vmpw: 3\n" +
			"ngps: dldp - tcfl\n" +
			"fnpq: tqcm * lzmr\n" +
			"tlnm: pglw * pbjl\n" +
			"vdcz: ddjl / nrpb\n" +
			"tgdr: 2\n" +
			"gdgr: 4\n" +
			"wbnd: sgzq / zdrv\n" +
			"rwps: 2\n" +
			"nrrg: gzhp / pqtz\n" +
			"dvlz: wpwm * qtjg\n" +
			"jcfg: 6\n" +
			"vgtf: 5\n" +
			"cvvl: 10\n" +
			"fmqp: nqhh * mfcp\n" +
			"pvvr: 2\n" +
			"vlqh: 2\n" +
			"fqff: 2\n" +
			"bfqh: 2\n" +
			"rplr: 1\n" +
			"dbvq: 2\n" +
			"wcrp: 4\n" +
			"qhns: 2\n" +
			"jhmp: cgqm * pvbs\n" +
			"nwnj: blmn + shzl\n" +
			"frvv: 4\n" +
			"qstb: 2\n" +
			"lhtm: 5\n" +
			"twdj: 2\n" +
			"mzsj: 5\n" +
			"qczc: dnfz / wphb\n" +
			"rhrr: 11\n" +
			"zvdr: 4\n" +
			"vbzt: qszc * rgqh\n" +
			"fzds: cdzr * nclm\n" +
			"lzmb: hgzp * zdjm\n" +
			"mvjf: vcbf + snhn\n" +
			"dnjn: qqnz * bhpr\n" +
			"rsjp: zgtf + gvjc\n" +
			"lbtz: wtdd * djht\n" +
			"lwrf: pdsm * vvpl\n" +
			"hmbt: 2\n" +
			"vmbp: hcnt * zdmf\n" +
			"dhjm: 3\n" +
			"dsfs: pwfl * srwf\n" +
			"rwmf: 2\n" +
			"jznp: jwtz - sdsc\n" +
			"djjh: fptm + hzhb\n" +
			"dsqp: sjlb - qqwj\n" +
			"fmbg: 1\n" +
			"scww: 10\n" +
			"lvgd: 2\n" +
			"bmbl: 7\n" +
			"hmcm: 7\n" +
			"dlnq: 5\n" +
			"cccj: 2\n" +
			"znmm: htvb * qhzm\n" +
			"dldp: vcnd + chtf\n" +
			"npfq: 6\n" +
			"bpfj: cnmp + rgpp\n" +
			"pdbv: bgdc * zrpq\n" +
			"znbh: 3\n" +
			"nbgr: wlwt * sjfv\n" +
			"jlhw: 6\n" +
			"wclj: 3\n" +
			"znmv: zzgd * jjvh\n" +
			"wzrw: ffzj - vcvn\n" +
			"jvnh: sgmz + cdjz\n" +
			"cmnw: zltt + rdgm\n" +
			"vvpl: 7\n" +
			"fjmw: zlrj * zvdr\n" +
			"bgsm: fgzt + bcph\n" +
			"cqch: prbt + dnqz\n" +
			"scjj: 2\n" +
			"btvd: dbnw + gcqz\n" +
			"jqvr: hvdh + hcqs\n" +
			"ggnz: 13\n" +
			"rsdc: dflp * bhrz\n" +
			"lcsg: 1\n" +
			"npmz: hgrd + hhmg\n" +
			"zzwm: pjbm + fbwh\n" +
			"chdw: 3\n" +
			"cswd: 3\n" +
			"dfgz: rhnt * rlrb\n" +
			"hjzl: 5\n" +
			"grht: glfp + hqtl\n" +
			"dljt: 5\n" +
			"qpcn: wnmz * shjg\n" +
			"srbr: rfrz * hvdn\n" +
			"hgzp: rmdd / dmsp\n" +
			"pfjn: phlr + nmhb\n" +
			"gmns: wlhm * znts\n" +
			"wzfv: ppmg * cqhm\n" +
			"qrgs: 3\n" +
			"mbjb: mqlg + hqft\n" +
			"clcl: dppp * tsdt\n" +
			"qthv: nrrf * vpgr\n" +
			"glfp: 3\n" +
			"nldw: mzgc + wptn\n" +
			"pqdg: 3\n" +
			"fdww: smlp / jpjq\n" +
			"sgdj: mqwv * rhlg\n" +
			"gbtg: bnds - pscc\n" +
			"nhlh: 3\n" +
			"rfds: 3\n" +
			"vdzg: wlbr + gsfq\n" +
			"svpj: hnhm + rjmg\n" +
			"ltzp: 5\n" +
			"lscc: 10\n" +
			"brbw: 2\n" +
			"tpzs: 4\n" +
			"mmll: 2\n" +
			"bcdv: 3\n" +
			"lbtn: 2\n" +
			"jdpw: rwtc * jcvc\n" +
			"tscz: 2\n" +
			"snhp: wcrp * hddf\n" +
			"fbmf: 1\n" +
			"jwft: 2\n" +
			"gvtp: gcwr / lflq\n" +
			"tpql: gslv + vpdj\n" +
			"jvwr: dbpd - jqps\n" +
			"sfcz: 3\n" +
			"wlvp: zrrq / gjlr\n" +
			"rlhd: dtmw + pdgl\n" +
			"bwft: 9\n" +
			"rcgn: zcdb * nhlh\n" +
			"zzcw: fjlf * lzbs\n" +
			"wjrz: dzvl + jvcn\n" +
			"vnfm: hjbn + wdwq\n" +
			"mncn: 5\n" +
			"scqr: lsdr * tpzs\n" +
			"clgf: 14\n" +
			"fhrt: zzvh + vzzr\n" +
			"msbh: fwgf * tplj\n" +
			"jghw: rvnh + pzln\n" +
			"djmm: 13\n" +
			"msww: ghnr + jpsj\n" +
			"wjdg: 20\n" +
			"jpjq: 2\n" +
			"tqjs: 2\n" +
			"hlzm: djjh * mdpq\n" +
			"gnqt: vrgz * ptqt\n" +
			"nlnv: 2\n" +
			"cdln: 2\n" +
			"htvb: 5\n" +
			"lbsl: lhjb * hwrn\n" +
			"tnwl: qldz / lswd\n" +
			"bbps: 3\n" +
			"nzbr: 13\n" +
			"dldc: 9\n" +
			"ljhb: mrpr + vbrl\n" +
			"zmfz: scww + ncjq\n" +
			"mmtw: ldnm * ghdl\n" +
			"htwn: 5\n" +
			"ztjv: wmjg + csrv\n" +
			"nfqv: hgdw - rdbb\n" +
			"mfcp: 2\n" +
			"zsfb: 11\n" +
			"vmjq: hhsm * jmpz\n" +
			"cpbm: 8\n" +
			"sthw: mgtl * rrgb\n" +
			"zmqm: zhcb + rtwr\n" +
			"cqht: tmlm + sqrr\n" +
			"vnvg: 3\n" +
			"dcrb: qnzd * wqtl\n" +
			"lbnq: jrwb + zdtn\n" +
			"hbvj: pnwg + qwpp\n" +
			"fsrf: 4\n" +
			"vljd: tjcv + rggq\n" +
			"rsqc: 3\n" +
			"dgrv: mvsd * qgnn\n" +
			"chvf: bmbl * cnmh\n" +
			"znrw: 12\n" +
			"znft: 5\n" +
			"vnzs: 2\n" +
			"lpnd: dtmt * lscc\n" +
			"vwzl: fdft * lhcg\n" +
			"dclg: dppt * dbsr\n" +
			"lhcg: 2\n" +
			"tqzr: 2\n" +
			"hzrn: shtj + zjnt\n" +
			"jhwz: 3\n" +
			"zrjs: bsds - sthb\n" +
			"nwtz: vmvm * gbzz\n" +
			"gwbm: rjqb + vgzf\n" +
			"zqnm: 2\n" +
			"nwcg: 5\n" +
			"rfwd: 5\n" +
			"zgff: 10\n" +
			"gcfg: 2\n" +
			"ttbp: 3\n" +
			"hnbj: 2\n" +
			"mwvm: 2\n" +
			"nwmg: jclw * zsln\n" +
			"rgdg: srhq * bhrd\n" +
			"zrwl: fdjg + gdzb\n" +
			"vmld: ntmt + fmqr\n" +
			"wmjg: zlsz * zzcw\n" +
			"pdgv: zjhc * gtfs\n" +
			"zzsw: 1\n" +
			"tfdb: 20\n" +
			"sgbm: 2\n" +
			"bpbl: hfmf * zjjn\n" +
			"trqs: 9\n" +
			"trvl: 17\n" +
			"crts: 2\n" +
			"fvnd: 2\n" +
			"bzzn: fdfr * znft\n" +
			"bprp: jjcm + gdzt\n" +
			"gtzv: 2\n" +
			"ltln: vgvj + gmgm\n" +
			"wtqb: ffsz * jhmz\n" +
			"cczm: 17\n" +
			"zjsp: 6\n" +
			"jzcz: 3\n" +
			"wzjd: 15\n" +
			"hndd: cccj * pqdg\n" +
			"wzjm: frqm + wjgl\n" +
			"fqln: rgpw + pvzs\n" +
			"hljd: ffjw + pdgr\n" +
			"zflr: 2\n" +
			"ldmq: rlrg * nvsn\n" +
			"hwrn: vfpp - tsrs\n" +
			"cvbs: fsqn + vfvs\n" +
			"gsmh: tdpg + vpch\n" +
			"czdv: dzwv * cgpq\n" +
			"svgt: lrzb * tfwd\n" +
			"jmfm: sgbm * dhjm\n" +
			"fglw: bsgt + vnhg\n" +
			"ddww: 9\n" +
			"pjqz: zhhf * rtfz\n" +
			"gwzb: 6\n" +
			"qmjf: jlhm + wzgc\n" +
			"fdjg: rsdc * wlpv\n" +
			"bsmg: 17\n" +
			"sqhq: cdpw + zgff\n" +
			"zltt: nmst + prwt\n" +
			"wffn: vnfm * tcbt\n" +
			"ftzh: vnjm * schb\n" +
			"mzpd: pdps + nzsf\n" +
			"tnlv: 19\n" +
			"wwmj: hcpj + jcbn\n" +
			"qvqw: 8\n" +
			"snsq: zgrr * ltql\n" +
			"cmfb: npmz / lhtm\n" +
			"llwq: 6\n" +
			"ljgd: gfdv + hrnl\n" +
			"cfjh: jvcq * qptv\n" +
			"bttt: 2\n" +
			"lfnl: bgcm - hwnf\n" +
			"hqcg: qvvw * qjtv\n" +
			"mtwj: wjvt + qzzb\n" +
			"qswz: qjtz + fsjw\n" +
			"fcjn: 5\n" +
			"phlr: jvjf * mnzf\n" +
			"cbbc: 2\n" +
			"mzgc: mrfh + rgdt\n" +
			"hbpc: fzjb * fqth\n" +
			"tmlm: brqj + brqr\n" +
			"vfbg: pnpf + lbzm\n" +
			"hqvt: 2\n" +
			"lpmp: 2\n" +
			"zdnp: 5\n" +
			"ptqt: tgsc + ttsm\n" +
			"wlwt: btcl + tbnn\n" +
			"hvrt: 11\n" +
			"rvdt: 2\n" +
			"ffhv: 2\n" +
			"lcjn: lbtn * fphq\n" +
			"zmtw: 2\n" +
			"wgdv: 3\n" +
			"vdwc: fgmz * zmzl\n" +
			"cggl: mwzh + djjl\n" +
			"dngp: 10\n" +
			"nvwn: 4\n" +
			"sddd: tgsq * ccqs\n" +
			"jclw: fpmh - dnml\n" +
			"wmdw: 2\n" +
			"hvgr: 2\n" +
			"wnmf: 20\n" +
			"smlp: gpqw + bdqh\n" +
			"zflc: 2\n" +
			"lrzb: zrwv * bcrq\n" +
			"gfdg: 3\n" +
			"rjtp: 7\n" +
			"nmpz: qfjp + znmv\n" +
			"gnnp: vwzl + czdv\n" +
			"mnzs: 3\n" +
			"lhjb: 2\n" +
			"tqgp: fgfz * tfhw\n" +
			"hqjv: 3\n" +
			"chtf: nzbj * nvtq\n" +
			"csdj: zqlm + ldmq\n" +
			"zwwr: 2\n" +
			"qfbm: qszn * slmc\n" +
			"bvdf: 10\n" +
			"qcpr: 2\n" +
			"cfzq: fdgz + jcpr\n" +
			"crzb: tpsg / rsdz\n" +
			"mldl: 4\n" +
			"mhnn: 7\n" +
			"qrms: zpqz + slmn\n" +
			"zjhc: 2\n" +
			"tbfd: dpzb + vvdq\n" +
			"qnzm: jgbq + sngv\n" +
			"jgbq: hbnt * whsz\n" +
			"blbw: 6\n" +
			"vhtl: gvsc * fnlt\n" +
			"zdjg: glpd + hgsg\n" +
			"pqnw: 2\n" +
			"pszh: 5\n" +
			"jhmj: 2\n" +
			"qdcd: 3\n" +
			"rtrq: tmqv * zmfz\n" +
			"blgt: 12\n" +
			"zfgn: 4\n" +
			"tdpp: 3\n" +
			"wzvv: cbnf + pqjw\n" +
			"mjbv: 7\n" +
			"lbcm: qrnd * dqvs\n" +
			"vjhl: 9\n" +
			"gjnv: 7\n" +
			"bqbd: 3\n" +
			"bfmp: 2\n" +
			"dhtr: 11\n" +
			"mscg: 4\n" +
			"jrfv: mbnl + mljs\n" +
			"rrqw: 6\n" +
			"zfbg: 2\n" +
			"wnsh: 6\n" +
			"cblb: rdrw * qsrr\n" +
			"dhvq: rmgz * drzl\n" +
			"nfmq: wclj * dlzc\n" +
			"tbnz: 6\n" +
			"bqww: mdhv + sdtq\n" +
			"tcbt: 4\n" +
			"dnjf: rmqz * bpfj\n" +
			"vlns: 7\n" +
			"hzqb: dhrt * svgt\n" +
			"fzqq: fjfl * cvmb\n" +
			"mbvv: qbdz * cnsd\n" +
			"hcrv: 3\n" +
			"wvdp: 2\n" +
			"fbfb: 15\n" +
			"mpsv: rlrm - qqmn\n" +
			"grtn: hbcn + jhmd\n" +
			"btjw: thrg + gnsv\n" +
			"rrtd: 2\n" +
			"cgqz: zmqm * gcfl\n" +
			"rgzj: ftzh - stdd\n" +
			"gwgf: hzqb + rsjp\n" +
			"vgzf: gqll + sczl\n" +
			"gdpp: nflg * fmmn\n" +
			"nflg: 7\n" +
			"gcdc: 2\n" +
			"lvct: wlwh * rdvd\n" +
			"bsvl: zwjb + qlrt\n" +
			"nltn: 3\n" +
			"vmqm: 2\n" +
			"gqwq: 3\n" +
			"lsdp: vcsv / bzmt\n" +
			"ghwj: 5\n" +
			"rnqp: 10\n" +
			"czth: 4\n" +
			"lrpc: 2\n" +
			"wcmm: 18\n" +
			"pwmq: rthz + hcll\n" +
			"mnhz: czth * tnrq\n" +
			"pjbm: 1\n" +
			"fznm: 20\n" +
			"zdtn: sclj * pjqz\n" +
			"zpvh: csdj + vdzm\n" +
			"zjsw: 6\n" +
			"ffgm: lhqr / mnhz\n" +
			"prvb: 3\n" +
			"zcbb: 17\n" +
			"gjlr: 7\n" +
			"mvvr: 2\n" +
			"wprs: 1\n" +
			"zfpj: 3\n" +
			"dqgf: 3\n" +
			"fgmz: 6\n" +
			"fhpt: 5\n" +
			"bqwh: hzjs * wjlt\n" +
			"wlwh: dlnq + tgdr\n" +
			"bncr: 3\n" +
			"tbsj: 7\n" +
			"rdng: 3\n" +
			"drtg: dddp / rvns\n" +
			"vfvs: lvzp * vvsg\n" +
			"lszh: cjcf + wftp\n" +
			"bvlr: 3\n" +
			"lflq: 2\n" +
			"mwzh: 1\n" +
			"dnml: 2\n" +
			"sttq: 1\n" +
			"gznp: 3\n" +
			"wlfl: lmcm - fcjn\n" +
			"pcfh: 5\n" +
			"csrv: zdjg * szgm\n" +
			"zfzn: 11\n" +
			"hqtc: tlgn * tqjc\n" +
			"shqb: pqzp - rnjn\n" +
			"flwb: jlgs * mlbm\n" +
			"vzzr: 5\n" +
			"dsbl: 2\n" +
			"fvhh: 5\n" +
			"tgsc: 5\n" +
			"htdl: vqls * nwcg\n" +
			"bfpz: ndrt + ljbw\n" +
			"qwbz: cmfb * mvvz\n" +
			"bwdm: 1\n" +
			"mqvs: 4\n" +
			"dgtr: 2\n" +
			"thml: ggnz * qmvw\n" +
			"hvjf: 3\n" +
			"ghzt: dztv * fhdp\n" +
			"qghb: 5\n" +
			"cqjc: lrlp * vgmn\n" +
			"dqvs: 3\n" +
			"qjhs: 11\n" +
			"hfmf: 8\n" +
			"hbqn: lfsj * tzws\n" +
			"nvpt: 3\n" +
			"lgzl: 2\n" +
			"rqnr: llbr * mbtp\n" +
			"rpnd: 13\n" +
			"hqtl: 20\n" +
			"hjmc: ghwj * zvdp\n" +
			"vzhs: dfwj * sppd\n" +
			"qgjb: 2\n" +
			"mqrg: frvv * wlvq\n" +
			"gnwb: 2\n" +
			"gshm: 2\n" +
			"ldzw: jlhw + gqsp\n" +
			"qwhd: 7\n" +
			"btcl: 12\n" +
			"nbts: 4\n" +
			"hbcn: 3\n" +
			"jgfc: ghzt + wtjh\n" +
			"wpdw: cgsq + lntd\n" +
			"fptm: ncpr / jmmb\n" +
			"vmvm: 3\n" +
			"hcnt: 4\n" +
			"ltql: znmm / drqd\n" +
			"qpmj: 7\n" +
			"dzsc: rcsd + lwdc\n" +
			"qlzv: 4\n" +
			"pznc: pjqw + zfvg\n" +
			"bmtd: 5\n" +
			"hnzn: zbrc * cfzq\n" +
			"lgdv: jsss * jjgq\n" +
			"sczl: rnwh * vjlb\n" +
			"ggjq: 4\n" +
			"wshb: 3\n" +
			"nzcw: 3\n" +
			"jsss: 14\n" +
			"mrtg: bbsw * mzpd\n" +
			"cbzz: tbcl + hlhw\n" +
			"vtnz: hbfq * vzwb\n" +
			"bmpz: frvj + nqrv\n" +
			"stdw: fvzd * mpsp\n" +
			"ltgv: bfsn * gtmm\n" +
			"mzpq: djmm * nwtn\n" +
			"vpgr: dqmt / ffvb\n" +
			"lwtd: 3\n" +
			"vjqc: 1\n" +
			"mrbs: 2\n" +
			"jmrj: 4\n" +
			"cgmt: snhp + bvlr\n" +
			"fgmm: vqrs + vhnp\n" +
			"hjqp: tsfn * gfvc\n" +
			"zjjn: 20\n" +
			"sjlf: hljd * dgtr\n" +
			"tnrq: 2\n" +
			"frvj: 3\n" +
			"rggq: jpnd + znrw\n" +
			"lwdc: bgfv / hqjd\n" +
			"vbzr: 12\n" +
			"sppd: 3\n" +
			"rqnn: 2\n" +
			"rhbn: 3\n" +
			"rnpg: 2\n" +
			"hrcn: qzgt * wjdg\n" +
			"nsrf: 2\n" +
			"zhzg: ffgm * srtg\n" +
			"nsmz: hqjv * nslj\n" +
			"bjbd: pnlp / vnlh\n" +
			"hcfv: sthw * lrfj\n" +
			"qghw: qstb * trht\n" +
			"brqj: wvdp * hhbg\n" +
			"wcgm: 3\n" +
			"vcvn: 19\n" +
			"dzwv: 7\n" +
			"brqr: tqgp / hcqp\n" +
			"vqls: 5\n" +
			"stdd: 3\n" +
			"ldtz: 2\n" +
			"vtpw: cnrm * nwlg\n" +
			"pptw: 13\n" +
			"fczr: 3\n" +
			"cbmr: 6\n" +
			"fgbv: 3\n" +
			"nmhb: dnjf + fvbf\n" +
			"clvj: 2\n" +
			"ndpr: znzc * fdqr\n" +
			"btdf: htls + qrms\n" +
			"wlhz: 8\n" +
			"fpzn: cvbs + mntb\n" +
			"zzwq: ncgf * rtsb\n" +
			"gpss: 7\n" +
			"jntf: 3\n" +
			"dvvw: vmbp + twjb\n" +
			"jpmn: nldw * vlfb\n" +
			"wdwq: dclg * jjqz\n" +
			"vmhw: 16\n" +
			"cbjm: dtdw * ntpm\n" +
			"qssn: 9\n" +
			"phnc: 18\n" +
			"wrvb: 8\n" +
			"gfgg: 5\n" +
			"zqzg: pbqr + pdgv\n" +
			"pjcr: prqf + mthr\n" +
			"rpct: jvvm * mfvr\n" +
			"gfmv: cdqz / cjmt\n" +
			"gfvc: tcdd * cncs\n" +
			"chhz: 1\n" +
			"rhsn: zbnw + rzcw\n" +
			"lpsq: 14\n" +
			"zgrr: 19\n" +
			"gbdb: mstm * gmns\n" +
			"dqnt: gtcr - ttlc\n" +
			"dqmt: vngt * zgwz\n" +
			"rprh: 10\n" +
			"cwbn: dbtd + slps\n" +
			"mqfd: 3\n" +
			"fbbf: 4\n" +
			"ntqv: zzsw + mqss\n" +
			"mvsd: 2\n" +
			"dlgz: jfbd + nftc\n" +
			"wptn: qdrj * gnnp\n" +
			"nrsc: dcms + pvsc\n" +
			"cmqn: 10\n" +
			"ppmg: hzzp + slmm\n" +
			"gzcg: znrr + zmdq\n" +
			"lvms: tssn + cjmf\n" +
			"hgst: 5\n" +
			"gvsc: ddjw * pdch\n" +
			"qdfn: 5\n" +
			"tgng: tzld * hvgr\n" +
			"nnnv: 3\n" +
			"zgwz: 2\n" +
			"fprd: 3\n" +
			"dgzl: zvhr + vlfn\n" +
			"shpm: cnzt / plqt\n" +
			"fnlt: nzcw * fqtw\n" +
			"wzpg: qssn * zqnb\n" +
			"lwsn: 4\n" +
			"lsdr: jhmj * pcgl\n" +
			"gtbj: nmhp + jdmq\n" +
			"zqfb: lgnm + gmds\n" +
			"ntmt: 11\n" +
			"tnll: vmpw * fngv\n" +
			"wpwm: 5\n" +
			"qqst: 2\n" +
			"nrps: 5\n" +
			"qgqd: qgbd + twzw\n" +
			"crjv: 7\n" +
			"wjqg: 2\n" +
			"zzll: wqmt * llqq\n" +
			"tttg: 14\n" +
			"tlwh: 2\n" +
			"lprc: 17\n" +
			"qdml: 6\n" +
			"lzpm: cwjr * wvcs\n" +
			"qrnd: dqsq * zqnm\n" +
			"qqtl: crzs * sclz\n" +
			"hffv: 4\n" +
			"fdhw: 3\n" +
			"rjfv: btjw + lvms\n" +
			"rlrb: 5\n" +
			"sldm: 6\n" +
			"twjb: 1\n" +
			"dtsq: 16\n" +
			"bvsr: gnwf + hcdv\n" +
			"wvzc: rdlg * sqhq\n" +
			"sclz: 6\n" +
			"vzsp: cmnw + qqtl\n" +
			"srtp: 6\n" +
			"tdff: ldtz * pwpv\n" +
			"zqlm: 5\n" +
			"srbt: 2\n" +
			"llmr: gczv + nzcg\n" +
			"bbgp: drjw * bhrs\n" +
			"hswb: wfdw * tbsp\n" +
			"hzhb: swwz - dqnt\n" +
			"dcms: zcpz - lqbt\n" +
			"frcp: gfgg * zsql\n" +
			"fffn: 16\n" +
			"jlzd: 3\n" +
			"hfmp: dbvq * zsfb\n" +
			"cdlg: 9\n" +
			"pcph: jgfc * jqvr\n" +
			"sqrr: fdcp * brlj\n" +
			"gcqz: rprh * mfnj\n" +
			"vfht: 3\n" +
			"hvzd: rszr * dvgt\n" +
			"nrmd: 5\n" +
			"nmzl: 18\n" +
			"lwhr: 5\n" +
			"drnz: trbj / nnhc\n" +
			"nfqq: 3\n" +
			"zbrc: 3\n" +
			"hsbd: 7\n" +
			"bnlt: mgsg * gjzd\n" +
			"ccqb: qtsm + mhcs\n" +
			"rdlg: 7\n" +
			"wljq: 2\n" +
			"dppt: hrcn + lrwt\n" +
			"zqhw: 3\n" +
			"bnds: sgpd * pdbg\n" +
			"brfp: cbtb * mzvs\n" +
			"gnjf: 3\n" +
			"fnfr: 2\n" +
			"thzm: nqrh * cmsg\n" +
			"lflv: 3\n" +
			"mghc: 3\n" +
			"ddpc: wlbn + fscq\n" +
			"zjwl: 2\n" +
			"vmfl: bqwb * mwdf\n" +
			"cvbl: drbd + gqgp\n" +
			"lvsj: mcgh - hgrq\n" +
			"brdv: nfsl * lngl\n" +
			"hbjm: vnzs * bhzq\n" +
			"tzll: 18\n" +
			"sgvw: 10\n" +
			"vnjm: jmvn * lhfj\n" +
			"dfjv: cdqb / sctl\n" +
			"rlrm: vvtg * gtzf\n" +
			"mftt: 3\n" +
			"qdgc: 2\n" +
			"nbwq: 2\n" +
			"hqft: 16\n" +
			"tczf: mbjb / ssrg\n" +
			"qchv: 6\n" +
			"shdv: fdww + clcl\n" +
			"zvwq: zfbg * zfzn\n" +
			"tcbh: nghz * wjrz\n" +
			"blcq: 7\n" +
			"cdpw: jhbb * trjj\n" +
			"jrdv: 11\n" +
			"qhdt: zfmj + vmjq\n" +
			"fsvm: 1\n" +
			"bhrd: 2\n" +
			"nqrh: wdnf * mghc\n" +
			"qzhb: 3\n" +
			"vbvw: bprp - zvhw\n" +
			"bsds: rtpp * bhdc\n" +
			"jmpz: 3\n" +
			"fscq: tdpp * zwqm\n" +
			"dghl: 4\n" +
			"fccp: dmtc * jhmp\n" +
			"nllv: bqfz / mftt\n" +
			"fmnm: 2\n" +
			"qmvw: 7\n" +
			"cjhm: thdv * jjcn\n" +
			"vrsd: 3\n" +
			"ddhd: lzft * mmjg\n" +
			"bhrs: 3\n" +
			"dgvb: srbj * dfmw\n" +
			"sngv: 1\n" +
			"nwls: pqbg * ncfh\n" +
			"ndzq: 4\n" +
			"qvjf: 4\n" +
			"nlzl: twjr + wnsh\n" +
			"vfjl: hvgh * vsts\n" +
			"stzc: hllh * zvsh\n" +
			"qftz: 4\n" +
			"cljf: 4\n" +
			"cgsq: hpvw + dbbr\n" +
			"sqhd: 4\n" +
			"tzhj: 2\n" +
			"ggvn: nscv + drtg\n" +
			"fvfp: 3\n" +
			"cwjr: 2\n" +
			"zcpb: fnpq + ctsw\n" +
			"fwgf: 3\n" +
			"nstv: 3\n" +
			"bgdc: 3\n" +
			"vnml: 18\n" +
			"tcfc: 9\n" +
			"vbhz: cqht * vcfl\n" +
			"rnjn: 4\n" +
			"frqm: 12\n" +
			"hwsw: 2\n" +
			"bwtd: 4\n" +
			"jfzm: wcmm * tpfj\n" +
			"bncn: 10\n" +
			"znrr: 1\n" +
			"rscb: mpsv + dbfz\n" +
			"lwdw: zdqp * gcfg\n" +
			"zrwv: 3\n" +
			"llbr: 11\n" +
			"tssn: fgmm * thml\n" +
			"nfmm: 2\n" +
			"gjlp: 5\n" +
			"tdsb: 4\n" +
			"fpmg: wpvg * fbjq\n" +
			"qgjm: tvlf + qrlb\n" +
			"hfnc: tmgd + qmvm\n" +
			"mvvz: 2\n" +
			"rmdd: dtdc + vdpv\n" +
			"wwpc: fffn + zdnp\n" +
			"vcnd: 2\n" +
			"ncgf: 3\n" +
			"dwhc: 4\n" +
			"vtwr: sjlf / wngb\n" +
			"bzgd: dfnr * stfd\n" +
			"zwjf: 13\n" +
			"bfzw: 4\n" +
			"zqlr: 9\n" +
			"pbqr: gjzs + dzpb\n" +
			"ppqj: bqwr + rsll\n" +
			"qtfs: 3\n" +
			"dvrg: rqcn * fccp\n" +
			"dlfh: pcph - jrqd\n" +
			"hqhl: gshm * blcq\n" +
			"zdrv: 4\n" +
			"bhzq: 4\n" +
			"dbpd: pgtd * wqdb\n" +
			"dwmq: 6\n" +
			"fwjt: 5\n" +
			"qcvz: 7\n" +
			"flcf: sqpc + lrpc\n" +
			"shwp: 4\n" +
			"gjwt: hfqz * cbbc\n" +
			"bqwb: gshj - tpgm\n" +
			"svhb: mmcd * sjvs\n" +
			"gjfm: gvsl / sstr\n" +
			"gtzf: 2\n" +
			"lwsq: dfjv * gcdc\n" +
			"twdn: 11\n" +
			"vngt: chls + ntqv\n" +
			"hppw: 8\n" +
			"jcjj: 5\n" +
			"gzhp: nwdc - vrst\n" +
			"spln: jbbc + tzll\n" +
			"jhbb: 3\n" +
			"bfrv: rwgf * cwgf\n" +
			"dbcb: 2\n" +
			"wtpq: 2\n" +
			"fcbr: 7\n" +
			"pqvh: vqzj * pdvc\n" +
			"nnhc: 2\n" +
			"cmtt: wzjf * jqct\n" +
			"lczz: 2\n" +
			"cdtn: 9\n" +
			"hszr: jmbh + qzhb\n" +
			"srnp: qjbh + lwnc\n" +
			"rtwr: wbvc * wtmc\n" +
			"mgtl: 3\n" +
			"nvtq: 7\n" +
			"pwwt: vtwr * fvql\n" +
			"pnpf: slwj + bggm\n" +
			"vpdj: gtpw / qhns\n" +
			"pwfl: 3\n" +
			"qdlm: 2\n" +
			"vsnw: pqcd * lwsn\n" +
			"gqgp: vctw * lwtd\n" +
			"ldwt: nzdw * frbn\n" +
			"scvs: 6\n" +
			"qtsm: gglj - dsfl\n" +
			"msmz: 1\n" +
			"zvsh: 16\n" +
			"zdmq: 2\n" +
			"frtn: 3\n" +
			"mzvt: cwmr + jmrj\n" +
			"cvld: nzss * qqjb\n" +
			"mjcw: qtln * fvcl";


    public static void main(String... args) throws Exception {
        int total = 0;
        Map<String, monkeyOp> stringmonkeyOpMap = new HashMap<>();

        for (int i = 0; i < input.split("\n").length; i++) {
            String ii = input.split("\n")[i];
            String name = ii.split(":")[0];
            String monkeys = ii.split(": ")[1];
            Long number = AdventOfCodeUtil.getFirstNumberOfStringL(monkeys);
            monkeyOp monkeyOp = new monkeyOp();
            if (number != null) {
                monkeyOp.number = number;
            } else {
				if (monkeys.contains("?")) {
					monkeyOp.number = "?";
				} else {
					monkeyOp.monkey1 = monkeys.split(" ")[0];
					monkeyOp.op = monkeys.split(" ")[1];
					monkeyOp.monkey2 = monkeys.split(" ")[2];
				}
            }
            stringmonkeyOpMap.put(name, monkeyOp);

        }

        while (true) {
            for (Map.Entry<String, monkeyOp> entry : stringmonkeyOpMap.entrySet()) {
                if (entry.getKey().equals("root")) {
					if (entry.getValue().number instanceof String && ((String) entry.getValue().number).contains("?")) {
						System.out.println(entry.getValue().number);
						System.out.println(((String)entry.getValue().number).length());

						long l= 109441158379765312L;
						System.out.println(l / 30753);
						throw new Exception();
					}
                }
                if (entry.getValue().number == null) {
                    monkeyOp monkeyOp1 = stringmonkeyOpMap.get(entry.getValue().monkey1);
                    monkeyOp monkeyOp2 = stringmonkeyOpMap.get(entry.getValue().monkey2);
					if ( monkeyOp1.number instanceof String && ((String)monkeyOp1.number).contains("?") && monkeyOp2.number != null) {
						entry.getValue().number = "(" + monkeyOp1.number + ") " + entry.getValue().op + " " + monkeyOp2.number;
					} else if (monkeyOp2.number instanceof String && ((String)monkeyOp2.number).contains("?")  && monkeyOp1.number != null) {
						entry.getValue().number = monkeyOp1.number + " " + entry.getValue().op  + " (" + monkeyOp2.number + ")";
					} else {
						if (monkeyOp1.number instanceof Long && monkeyOp1.number != null && monkeyOp2.number instanceof Long && monkeyOp2.number != null) {
							if (entry.getValue().op.equals("-")) {
								entry.getValue().number = (Long)monkeyOp1.number - (Long)monkeyOp2.number;
								continue;
							}
							if (entry.getValue().op.equals("+")) {
								entry.getValue().number = (Long)monkeyOp1.number + (Long)monkeyOp2.number;
								continue;
							}
							if (entry.getValue().op.equals("*")) {
								entry.getValue().number = (Long)monkeyOp1.number * (Long)monkeyOp2.number;
								continue;
							}
							if (entry.getValue().op.equals("/")) {
								entry.getValue().number = (Long)monkeyOp1.number / (Long)monkeyOp2.number;
								continue;
							}
						}
					}
                }
            }
        }
    }


    static class monkeyOp {
        public String monkey1;
        public String op;
        public String monkey2;
        public Object number;
    }
}
