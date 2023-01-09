package adventofcode_2022;


import java.util.*;

public class AdventOfCode_2022_03 {

	static String input = "PcPlnShmrLmBnmcwBhrmcmbHNGFGpwdFFwGNjNbGqNHH\n" +
			"tzQfRJfWZZztWzVtCTfRzFZjpFjNZjGLHbdHLDdjpb\n" +
			"CCQTzRLzvQVVfRzJfMPsnBlglgPmBgPmvSrl\n" +
			"RMfvbbszHTsssFPzDQPggpQJPQ\n" +
			"NSNcqVtLVGgDlpQBClVB\n" +
			"hmStGNNLhjNrpWLGSjWrZssbZTMMvTfMnThbRRTs\n" +
			"fTrTPGTbfftWBBmLjrJL\n" +
			"DqHwVMqVplDslmlZmpHVwNnShWZFdBBdjWBtWtdtWJSSLS\n" +
			"MNslpDvVHlwsmpQRgQgCfTTcvcRQ\n" +
			"pBBhRgDsMsswprBhvgRglZtFGFFRqZtZmRtNqtZPPN\n" +
			"TdmmzzmdZdqdGFtF\n" +
			"nmSccCVmSCpDCswMwl\n" +
			"NptqDsQtDTQzCvlzCpRlRp\n" +
			"jmZcndmjbZcjrmDvFMFFlwCvzFnF\n" +
			"jjgLVLrGcdDBNhWQTgHg\n" +
			"mLVhhfSMSTmMwClHGdpjDHjGdV\n" +
			"zPrZgJCgbsnrPtZzsCsbpRDjBRHnjGDRldRHppcG\n" +
			"JJrbsFrZqrgWbbqbrgWzJPNTwhTNCmmvfWCShhhmwwfm\n" +
			"ftgfljvgfgBTNvtggFDDGLGRDnMDzcQzncGt\n" +
			"VdbpbVdZwdwrsVVLRrMrDLDBGnBGcM\n" +
			"wmpWwWsHWBCCCPPvjvmSqlfTTmSNgN\n" +
			"jSqmzmmSSDRjLMLDwqjNcMMLTTflffWCCsRsTHnHVrfHWTsr\n" +
			"tdbgZpgBPdgGZGGFTHVpCsCVfVsJpnWl\n" +
			"FnPQFvbvhFFFbvBwScjhzcqSLLSzSN\n" +
			"bWdgrWwwFWbgzFWzrmNbdPqttChMSRnmqSPSnqtMRM\n" +
			"lcPJLDDPPfpMBCRJBtQtMh\n" +
			"lGDGjTGLLDHPPGjlPTsswsbHNFsNrFNFsrzr\n" +
			"VmtHfVhBLHVtlhphjZMdnQQZZqZmQDdzQQ\n" +
			"CPFwPWrvWgrfNgFPCMqZzMDDbznFTqqzDQ\n" +
			"NNPsfffPCsBLjpVltV\n" +
			"ssdBBJqJhlTJLsjTJqFFmnmmnnrcmpprmmmPcRlf\n" +
			"gqtqzSgWQWqmnRPPcNmmQM\n" +
			"GqbSVtGzvgvgWbZjjBhTdhBsTZBJBZ\n" +
			"jhNBsPDzLjsVhLSNzgvcvbcwbBWFcgtWCc\n" +
			"ZQQTTHHnGpMtnpdHpQJfMgrvWWFqbcWWGgrgwCCwwF\n" +
			"nHpmMnQQMmHpRnHRmMJnnTShPzljzjSNmSDhLsNSPtSh\n" +
			"GdqnBGFdlqzFnwdSCQZjZLLDZjZRvZLDVvgQ\n" +
			"PsptsTcftMfcTfhTghVDvvjnRNjVZnvV\n" +
			"WtPfJTfftJcMTrMnpccFwlCSCGFGCbCwJSbqBl\n" +
			"GjFLGhjRwFjNSjSdJCBBdQJddbBc\n" +
			"MVvMMHRzVtHlvlcQBQJHqdpQqCBC\n" +
			"vDgVztvvmrgrVRrMmsrsmZzZnWhGnNhGWTLfnLwTLhLTjngL\n" +
			"VljjQJSsrjjrCglsCjsgjVVfDLdZGMdvvGdQMzmvzcDQMc\n" +
			"HqPBtcpRWwtHbbFwBHZfmfpDfvffDfMfmGvM\n" +
			"PwHNbcwtqFqnwtNNqPNPPWBTThjhhVTCSJTThssVnSlJJV\n" +
			"GCccNCrrnCrpnzrnCDPcDDrvHHTBqTPhswqhPTBTTwBhTj\n" +
			"VfNmRtZgWWHdBdswdjZv\n" +
			"SmtQfgNmVFgVLVLVmrnMpcDLGCGLGDMpCp\n" +
			"CrdZdZmPPjrQdRPRDqDLBqBLBSWgWgLDzF\n" +
			"sQhTNphsVbhhhMJfhNVGqltVSzSllBzStlzFFFWB\n" +
			"hsMpwQhNMZmPmrwHRj\n" +
			"cNVpSVRpLHRLsVWWfnfsCshW\n" +
			"jvqjTgqZPlJZmbPPfbpswsPb\n" +
			"vlqdTZdtJvqdZjgqZrtRpQFtLFRQczHGzt\n" +
			"JJQndVQnQgTfNvGf\n" +
			"ljpbWbmNbDlGTvggGvZf\n" +
			"mpmRbMmmNDFDmScpzCsdzrnJrsCzrrnM\n" +
			"tNFtNFFzzjjzjBtVNZVbjZGlpSvTllpWwvnBlWGGBGCC\n" +
			"fPdcrrgPHrHMMMWlppGJSPwGSnGv\n" +
			"fmrqrhhfhdRddHrhQqQrfnLZjLtNttZjjRtzjFtRNj\n" +
			"sphRcpQRhfmnmfpptg\n" +
			"WVPlGLlSjCjSlGSHJJWZdmbmfvPmmnftbbgDdt\n" +
			"LJjjqVNjlnCTRcRhhsNcFF\n" +
			"vwwqttFjwgClRNCCvGNmZZMmJsPJjJpTdMpsZd\n" +
			"fBLVHHHrFnhHhnrVSTmfdPdPccTTPsMfsJ\n" +
			"QzVWzznzFbWNGNlt\n" +
			"vjMddVVmnWpdMndjvhhWfNLpfBsfLLZLBBSqqTZq\n" +
			"RFlrzQJPSRGzzzzgBZNsgBZTBflfgf\n" +
			"cQFDRHFDDGCJShCnvwVnnhCn\n" +
			"hgjlpRRLlPJJhTLJMDnwBndSPBNvMqnN\n" +
			"FGWVfZsmCbmVzrvtwCSMtMdnDMCw\n" +
			"VsVmVZfVQDmVFrrmzmGrHHTJgJjhHJcllglLQJRL\n" +
			"rrTVcTBgsjTffmfWHZTv\n" +
			"JLdnDlpGlGSLlpwJpHZfFvRZnWzWrHWqFH\n" +
			"wQDpDrdSlSCblCdwdSLlwQGBthPMsghNsVNVtCNNhNPjhs\n" +
			"CtCMvNhDMHfDDdffqtDtCflpJlBpvmWWJWwlpwFFvjwB\n" +
			"rGSbVGZrSsFJjlmBFZWp\n" +
			"rbbQgzVGrFVSPPGqfhftfqztNtqHtt\n" +
			"lMGZCGphllZDNshNNmHHND\n" +
			"PLwjVwJVsHmRrZZw\n" +
			"ffSdzjfZSjtjSjLtLLFFFGqFzznCpCnCBblQ\n" +
			"CqRnlzHCRWTlHPTZVQrcQtFsQFTcrQ\n" +
			"DfJcdBDBcftQjsrsBtjZ\n" +
			"JDfdGhSvNGhNfffGSfRznPvcRWcqCqmlvlcn\n" +
			"JPhBBBQCnCJCMhnhMZRrRZgbDgrWrNbglDgR\n" +
			"jLtSTwtsShwRNpRWrh\n" +
			"FLLSHsjGLGczvfPfJdfhddnHPC\n" +
			"BjHBNrWmTjFgJngbJhWd\n" +
			"vsGttMDtwCMQCJnqqqFJsggqdg\n" +
			"GFtDSwwMpTrzSSfcfm\n" +
			"rnWDQvpwWpDDcPjFPPHZjVDZ\n" +
			"CTJCRmCJcZZZHCCQ\n" +
			"LdlmdQJNpnLWbrfL\n" +
			"VdTdcVTZwCRGVGGMVmttlF\n" +
			"gnrsbngfgQSpBfpMBBBpSgMNNJbmGmlqGDqDNlFFJlGNFz\n" +
			"gprgQhgpMMMPsrRTCdPZwCwZZCRH\n" +
			"cHlCVGbbWHWqRNThhcNcmh\n" +
			"MwQDzpwdJwpBpPDQvrhShfLTTRLfLdjfNRqS\n" +
			"JwMBBrPsPDwQMDPPBPQJwMrvWHFbHHlgbsGnnWHnFnRGlblF\n" +
			"PQPjPDjRRQSFLSlgSmLlfh\n" +
			"zpLdBddbNCdqGbWJGWpJWWlsFsmmFpwfflFgfHwFhgmh\n" +
			"nJLdLVnzqqbjRctcPDQVTP\n" +
			"JdztScztPdSWLJLtgMbCjhvlbPRbjbMvCh\n" +
			"VZrqfQcFQwGVVFqfrTFTNqhljRHDMvMMGhRDRRHGbDhG\n" +
			"NZQNVQQpQmrZFQQFwQQVVZgBszJJgznstnmtcztdBSgs\n" +
			"nFHLNJzFbLJGGLMlTTRZbZRhWRTr\n" +
			"wVmgBBmtmwlqlWTwTM\n" +
			"sdvmgcPsCPPQQSMz\n" +
			"SccCqmQmgBmppLQmpSMjjlJzzsNPMDRbPNPlJM\n" +
			"VHZvwtZwhZHtdTwrVbNsljlRDlJPDhzsbN\n" +
			"dZwftVRftmcgpBCmBf\n" +
			"NTTlVlgNSflqbphFFhNbFp\n" +
			"wmmLmjwzwbWGLjRmtZZdhZLFtQQLQBFh\n" +
			"RvjbMjjvMzMWbDWwvzPjvmWSfVfsTlVVPVgTgPfVsnnnsJ\n" +
			"BsBsZHZNdWwsNdrzgCrMMqsjzzMC\n" +
			"flfhVWFmLrhQzCCh\n" +
			"fVbmFSpnSSmtnPZvdWbwvdvdHZ\n" +
			"NsZWWWWLsBZPhfsLmPhcFCCHCMMrqfqcvHMfHH\n" +
			"nThSllnplGlMpvFRcCqrrr\n" +
			"DnTwSztgzlDnVGTwztmdZhmLdJdNDshBdsWs\n" +
			"RBBGTFZGglMHvrtcgSdnNgjg\n" +
			"DmVcbmbJmwJDJzVVwzJfmfstnztvjnNjvNSpdptvzCnpjj\n" +
			"DsLcfLmbhVQssQJQscWRPBZZMMRLHFHZBGMG\n" +
			"FVvhVnhFnFhmvFhVcMBHLgcPClrqqrtqCppldrRRTppldg\n" +
			"QLWfDNwsQLtlrrCtDdpq\n" +
			"sJwZwLsGJWGGwzzWZNbWNLjQHSVhvHSnhcMFcbVmnvcchSBS\n" +
			"jTMNMrHBJWWDffRqfDBqfD\n" +
			"QmSFphtQqQmVmqVnPnPlpwgfnRnDPl\n" +
			"VqFmLFbLhmZhGFGmCmGtZLtJWzWHcJrNrHMccjMscMHzMZ\n" +
			"hGPGmbfPzbPfgdMdWGqBGQcqpp\n" +
			"nvFTvDrTdNZZlrjnMHHHpBBcppqq\n" +
			"rNlZZNLvRdRCRFFwZwhgbmSJPSmPfhfwhS\n" +
			"vjdbFWTtFRRvtvZZvdWJWbGjLhCcnrrrNqLNCPqchShNqc\n" +
			"QHQVlDsMfmmDMHDBdLdCSLnhNLNNfqCd\n" +
			"VQHsMDpHlzMBBwlsmMzmmlVwptvTWdvJdbvJtRTWgGFJJGtR\n" +
			"nSScBcnbbFSQVdBFBtWpwtvtPbTZthtTvT\n" +
			"pRzHpGjCDGzHGCGsThqqwZwPhCtvhTqZ\n" +
			"NzlzjDDpNldBFrlfFQ\n" +
			"qJlDlPPWppgppqPlplpfdvgnbMfGbdgCghMdCM\n" +
			"QWTWZcSsWbvVvTnhfC\n" +
			"tRFLwZrcrWzzlJmtBqlm\n" +
			"HMNMvvzzNcmfNmfbhs\n" +
			"qVcwCgjCLtWRSLsTPbmPfmTh\n" +
			"RtWCJgddWRtCJdWWgdBjwWWwpzMFpHGprcBGFFnGHQZHQGpF\n" +
			"gZgBDgDVGDGjmDZRtgjvVvtQdnLrcRcrdfdfCcnlscsJsn\n" +
			"WTqzqHqNzpHpwzNhMHNwWPbQCQcCLsnCrLLfcrffNflcNn\n" +
			"zHTwwpTPzTTwlFTFzwqzPbwZGgGZZBtmGGvGmBGZVFStFZ\n" +
			"znlSSzfzTcmmfcCt\n" +
			"PHWWGpqgPShPMwGwqJFTVtwtCVTCmTJcFc\n" +
			"qHqqSggLrRLBbvDDdndzRQ\n" +
			"WBddBQWZWWQqqQFMWfmrWsJnmVJJNDDVJGsLmHmLDN\n" +
			"PTgCjvCCPPPzSZGJVLsVZCHHnH\n" +
			"pzwtPTvzTjRTPtwSjPSzRgBbWMBfMwwZfbWrMrZFqFFM\n" +
			"BqDwVqdqlDlblQMf\n" +
			"ZcCWWcWzvJZjcPjZZZfTHfQJQHThqpMbQQJf\n" +
			"LPCcZcczZLgCjvPWgvstjsjmRRBdmGrdGdmSFGnFrtGmqr\n" +
			"CBvgQssVzfCBQSgvvvfmrlGrCtMGwthJlJtbrh\n" +
			"TpLqLRFpqdRpRTfNPtRmrMMtMlMMmlMJlt\n" +
			"PZTjqFFTHZZNZpqcVWzVvgzcWnSWfBDD\n" +
			"SVSTpgpVpdNbpcVdfjcNfbcJnqsltcJPvRJqRwQqlQsJls\n" +
			"zhWzDLmFHhmrWZmmzHJJQlnswqsvttrstQqs\n" +
			"zGtZFGGCmZmGGFhLBWBGGFdgVjgppMTSTgMfCNfVVSdj\n" +
			"CzjNJGcnzQJltPHttcPHTP\n" +
			"bLVsqLbLmSSVrqmdhVSmsVFFprfrFWrwTTWWWZpFPtlP\n" +
			"ssDsMqLqhvmvhdmdvzRCnQgRzzBjgnlNCM\n" +
			"TzTLzzSGRlRSjWzlWRzHGTpNhPhJPmdnNPPbhlbPbdhfPh\n" +
			"mBCDBVrCqVQvQMBcVcqBrBDsbtJfnZNbJndNNhthZNJfPZPs\n" +
			"wMCrqVvBzmzHTGLw\n" +
			"NbfwfZPPdVNPdBdQBcmQzrQz\n" +
			"nnWqHLWGFMDFDLDjsqnHLsrQGzmJczmQrgJmJGZmQrgJ\n" +
			"FFWRsHMHCZCWFwRwphpvlfTTpp\n" +
			"PclPlVZvLDNvVZSLSMvvDttmtfzFtzHqtqtzzccCFc\n" +
			"jrggQGhjQsTDbrbJjJQqzzCsdtzzFCdHqmBBHz\n" +
			"WGDgngwrQggZMNvMWPMRRV\n" +
			"wNgpMdMMcdSscccNcLLTbtQJtQJQltJwFtlBlzBt\n" +
			"HHGhrLrCvHWHCPhrWDtnBllnQbfQftGnfnBF\n" +
			"HvLjWCLHPZvHHHZjjrqVTTZVcppMgNNNNSpS\n" +
			"QQrwQmvWQjgTfvBjfffrSDcrqSqDDVLctqqcVd\n" +
			"GnHFnGhGplGMlHMNhzBzlLPLVcVNCPDqVNdcqLdqtV\n" +
			"GnMGpslMhGsRzzHzGsZFZQJTTmWfBbvfgfgJRfbwbW\n" +
			"MRCtSwMhvjCGtvMZDVWpVZJlVccNDlpb\n" +
			"gdLQFFwwLfHJWnQlcJJbWc\n" +
			"rdqdmqHLTLmsswsFHLFtMPRMCSSRtSjTPMPSCR\n" +
			"jmCCnLCLZjZjRjQTLZQhGPGhhzHhDRGRDzwzwh\n" +
			"stlJlrlJJcSSfSMMzPfhhGhzpwhpNwhD\n" +
			"rbrbBcSlWmdZWjDnTm\n" +
			"PNBRNnnqQRNfVfRtVVzgFLLttpSwgzzzmFFF\n" +
			"fcWlcbvvCFzLbwLw\n" +
			"rlrMrhTJhDcTTfhRNqHRQPQRQNQB\n" +
			"TrprpprRVVfpRpVqTVpzDdvmvbbCchhcttqcthSMdd\n" +
			"JlnZnFlsMBZnJHlsLsCLbSNtbNhdbbShCScm\n" +
			"FlZjjsHHsnQFQwTDzMRRpGRR\n" +
			"wHWzwCTTqJhzzvJhWHWhqJWrFsFQrrrFCfFfgjjgjprfsp\n" +
			"DBRmZRtZLbnRBGSBmtGSLpjBrrsfrgsTQVrVrrPrgr\n" +
			"DLnbcbtLtmNNmbRcGbcGmHzlThNNhqJTHdvqvWlHJh\n" +
			"GSNqjRcqflNLnCTTWrWn\n" +
			"BmwQtmtJwPwmzMwQtHtVssvrnpWTTnsTTgpVCLCs\n" +
			"DBBQHJJrzhzQDDfSljRfhccfcdZf\n" +
			"wtgtChCwzqgLzjggqtHtjFHHFcnPfdRDfZZVcPfVZZfGnfdm\n" +
			"vBTrRTTWGGmcTDVD\n" +
			"SJMbbpWslJblSSNzNsztRChzqRCj\n" +
			"gBHHCtVCSHMQlfFTQqCfmq\n" +
			"WrpdwjbwbwQGlPqSqblP\n" +
			"wWDncWrDDNdWNRjScScjpzvHZtBMZtJsvLVgvzssBsvs\n" +
			"VppWpVfmZPBlnmrGBzhttMzMpctLLcChSh\n" +
			"FwgLJvRdHcwMzSzjzc\n" +
			"QvbgdQLQgDvsqvqRHRDdDQDBWmBGBflnVbZmZmmnBBWrmW\n" +
			"SqShwLFCQGpDHCtZCWpW\n" +
			"bdHPHjTbJdsMnPHPbdjgtnBlVlBnVgtZpDBpWV\n" +
			"bdmPcjbjMNMvvHbTcQRNfRwRwLffwwqwNF\n" +
			"zdRHTpQTQHQnpnnQRHTsNNlJSJWmzJmJllNmSG\n" +
			"FBbRvLbFRwLqbbVgBVqqLFqJtJNcltsSGmgmGtNtgWmstm\n" +
			"FLhhfvvVwvjqfLRBqLVqbwqZQrTTpHMHjdrpnnDPDQCdCrpC\n" +
			"JgjzvbJCWgbjgGbJWjRhgNPGHHBMtqBStZZsHMSsBqtD\n" +
			"cfQdwQFdQQppnVVnlFLLBsBZMhqPlPMMqBSHDtHM\n" +
			"wnQhcnVddmdWgjvjmvRjjJ\n" +
			"QpcRtndvsLcVJtRSzWSlWjzSbjjWBv\n" +
			"qGZPqCTmGPqgGTCqHgCqZCPFWbbBNBMNBbdBMlWWrbjlMbFl\n" +
			"qhHDGhCmPhZHgDmDVQthttRchLwLdwcc\n" +
			"srpPMwlMmsrGFGswvDRhRWRDJJJchJ\n" +
			"fSgBbCBNnBTTgCNLTCRJhRJVWhTcVVVFFJdR\n" +
			"SbBnnLNZCLFQCZjnCnZFjPrzqmlMmmsrpzrlsmtt\n" +
			"BBsfDfsBDSWRwlLqmWCpWcllrl\n" +
			"nQMgMnnnhdntgMBrCdpNNLNlNqLqLl\n" +
			"FnQFHzPQJjJGRBGvfR\n" +
			"lRnVRFFlgMCRVwLgFZRnZQHWdcftHdmcJHmmMdzzfz\n" +
			"DGBqGQbhhBDbSBpGDBzqdNHJdtmcWdqdmtcm\n" +
			"bjbsBvjhSlVsPRgLQl\n" +
			"dDLbRdTMRJMbFRzZBfzNSjtNBzBD\n" +
			"PmgspqqVrppTVrvrsPhhfQwZBwNjNtNffzqqfwwN\n" +
			"mCcmsngrPvpVTssCVsvsPLRRJllGFlnRGbMJMWWlJJ\n" +
			"fGlGZHRRbwgPbZRRNCdcSWpncnQtQWlWcWpW\n" +
			"JrTLJgVvVLQQvtSvQncQ\n" +
			"JrrrmMTBVTmjBMrVjrshmJzgCfzRPCRZPGHfbwNPzbZHNH\n" +
			"qqqlDDZzVVnNqHDDFFFNlQpzjrTvsvzTbgJQQggjJp\n" +
			"cWPWcCmMfCMWdtPMhMbQQQjGGjpdvjTbjgjr\n" +
			"WtMSBCtCwchChMfBWtcPnNVNqZZLDRNqTRnnlwHn\n" +
			"mvQQnhBvhmvBmncmZBclTZTQccRFNFFdqFFgVqSRrgFrppNR\n" +
			"MjzJPzGPfffMCjVVjfPHLCFRNFStqrdRSdqdNGRqNptq\n" +
			"HDJHPjDJLfjbzfwPjCzCWWTwlmQhBnsWBvVsvBvZ\n" +
			"RVjcshhscQhrVjhvzjVfDNnzGtftmDHFttFGGf\n" +
			"qLcBCCMBJJbTdBDnNtdfnmDG\n" +
			"WpZgLLclTclRwgjgsrwsvj\n" +
			"shhhltNPcDtlNcNMcsctNtppLZvWWFLTFFZpTZDQgFLT\n" +
			"dRgJVzRHbqnLpTWQvLLJfp\n" +
			"mCVCdzqHndbqHCrVqRrmbwtNBsmPwNmScPgtPhBclw\n" +
			"bDDZMDrFPsrsMcsrbJZJdMMGpSzpSbwRSSRGpCHCGzlhCC\n" +
			"BWWNQjBLQVHhlGpSCmwj\n" +
			"ffwnNwfgtnNgVVwfNWBWnFsMJTJTcPFJcTFDsrJstJ\n" +
			"vQbQLQBpBvbvpHplHNTHWGZDngntZCQGgZhGhtjG\n" +
			"rqccPPmcrffRmsmCjVgnrGChChDjgW\n" +
			"fqRJsJMSlSzSWTbT\n" +
			"brsjjJPJwrJJsrRRlllNQGWQpwppCtfGGtWzGGMQ\n" +
			"ncBqqLTDnmLgVDZVnBDmdtVVtMzWWdMCQdpQWdVz\n" +
			"hDZgTSSnTzNPNFSFPF\n" +
			"VZVJJtWTsfTVVWsJhPWrCjzSBJlHSmjJCRlNSSlz\n" +
			"CqMpwccgvvgLnvLbMMRRjBNHzjmGmwNHlmlN\n" +
			"gLqqvpCDfVDrTfVW\n" +
			"CNMDGNPPNJCGbLnTffsTLT\n" +
			"tcBBRlrBdQrtmtWFjjbnrTjjFbjr\n" +
			"cTQQhcmvcBRcwDMVDZZPPCJh\n" +
			"mBCdgPLgZmLfGmfvGhtRQJWjtjQGQhtN\n" +
			"pMwrVwbwHMsqcTWQhQWzggTTWp\n" +
			"nnSMwrlrsmSZgvvmDd\n" +
			"WNSzpCzNzqzNdmqrRHrrLHFrJH\n" +
			"MtPfvnGMPnMcbnRtDHTRFFDrmJRQ\n" +
			"PcBsfPPHPGGfcSzZjNjpNZZdCs\n" +
			"mDCZVLDhWVSDCRvGtsGgGRHl\n" +
			"JjPwPNdcPnjPdcwNltHzzGmgGJzQJJRQ\n" +
			"dqfjnNmwmbmWrZMbMrThhB\n" +
			"qtBpNZFpBGFNfZNPmZPmQmHrmPPPTz\n" +
			"LLwJLvDvlWWLHdwDrVcCRcDVzzVVcV\n" +
			"sMMwvgjnMvjvnlsvNFBqfGHFqHGjtSpS\n" +
			"MmZZsFgwJTdTMdgmZdZRgFhDHhPQPPnRPhCrHhnnrPDD\n" +
			"fBcLlNNpQCDLDJJC\n" +
			"jSbWWlWpBpclWlWpNWlVBbWVdgwswFJmFJsGtdMggZFGbZwd\n" +
			"CMVQVMLLMFGRCMWQttnqqwQwhqsm\n" +
			"pJzlczSpPpPgmsqNhmPGDstq\n" +
			"gZgTccZGGpzdpjclGRVMVRFRMFvHRLRdLf\n" +
			"FMWMSBtStZqZWQtFtScWWSZmHPVJJVHwwlTgmgbzQwbwTJ\n" +
			"jhGLhdjNjsLvLsshzHJPVdVmmbzHzdHJ\n" +
			"jvDRNjnDNGRCzjLzZZpqnrFBSccWrMcB\n" +
			"zggmthDDghHvtrdgrVWfSBRwTHLWHwsBWw\n" +
			"PGGjpCjQnJQGJcJnnQpjFWVSsZWVLRZLBcsWSZBRWS\n" +
			"FGQlpnJCbqqGGRCjjnlCqGMtdNmmmvdNmmmzvhbrmgMz\n" +
			"TstvBTdgBhqTsdTcPlfCSrNMrNnrCNNSNNgp\n" +
			"HwLQwQDZzDjnDbmMhNSnmm\n" +
			"FZLVzLLQHRRzwWHjdPlJctlJtlsllhRs\n" +
			"fBtPsMDDswHvBmmVdBlSBRcGGnhVhg\n" +
			"LWJbrpFqpTLTTjqqNWlhnRGGSnhrcSdlRlsh\n" +
			"JWNbbpjJzTbNNNJNJMvmvfZHvzDsHDCsZw\n" +
			"LPGnPNLtwGhFFnJPfsqpVVszzpsP\n" +
			"TcWdvlrcWddggrDBDDdDMmWzRJqfVQZqmsfZsRQzZfZzQJ\n" +
			"TldWrMrDdlDCDdMTcwSLVCSShLNSwHjhGF\n" +
			"JGsWWWQsJmPwQWbBPmccbcbqFfMMpFDVCDFVFVCDqqfFwD\n" +
			"ZtLnlvLnNtvLndnCmfMVSmVCClfpVp\n" +
			"zTzZtjnZNLNmZvdtznntHHZJbBRGBRQWcJGbGsbsJRPQWT\n" +
			"MLmlMTPtQtMNlhbqbbqhflBB\n" +
			"rcrvjpSvScbRbBvbDBPG\n" +
			"ZZJzSHpzPrJzHFmMVMFmHCLNtV";


	static Map<String, Integer> points = new HashMap<>();
	static {
		points.put("a", 1);
		points.put("b", 2);
		points.put("c", 3);
		points.put("d", 4);
		points.put("e", 5);
		points.put("f", 6);
		points.put("g", 7);
		points.put("h", 8);
		points.put("i", 9);
		points.put("j", 10);
		points.put("k", 11);
		points.put("l", 12);
		points.put("m", 13);
		points.put("n", 14);
		points.put("o", 15);
		points.put("p", 16);points.put("q", 17);
		points.put("r", 18);
		points.put("s", 19);
		points.put("t", 20);
		points.put("u", 21);
		points.put("v", 22);
		points.put("w", 23);
		points.put("x", 24);
		points.put("y", 25);
		points.put("z", 26);
		points.put("A", 27);
		points.put("B", 28);
		points.put("C", 29);
		points.put("D", 30);
		points.put("E", 31);
		points.put("F", 32);
		points.put("G", 33);
		points.put("H", 34);
		points.put("I", 35);
		points.put("J", 36);
		points.put("K", 37);
		points.put("L", 38);
		points.put("M", 39);
		points.put("N", 40);
		points.put("O", 41);
		points.put("P", 42);
		points.put("Q", 43);
		points.put("R", 44);
		points.put("S", 45);
		points.put("T", 46);
		points.put("U", 47);
		points.put("V", 48);
		points.put("W", 49);
		points.put("X", 50);
		points.put("Y", 51);
		points.put("Z", 52);
	}

	static String elf1;
	static String elf2;
	static String elf3;

	public static void main(String... args) {
		int total = 0;

		for (int i = 0; i < input.split("\n").length; i++) {
			String ii = input.split("\n")[i];
			if (i % 3 == 0) {
				elf1 = "";
				elf1 = "";
				elf1 = "";
			}
			if (i % 3 == 0) {
				elf1 = ii;
				continue;
			}
			if (i % 3 == 1) {
				elf2 = ii;
				continue;
			}
			if (i % 3 == 2) {
				elf3 = ii;
				for (char c : elf1.toCharArray()) {
					if (elf2.contains(String.valueOf(c)) && elf3.contains(String.valueOf(c))) {
						total += points.get(String.valueOf(c));
						break;
					}
				}
			}



//			int len = ii.length();
//			String firstpart = ii.substring(0, len / 2);
//			String secondpart = ii.substring(len / 2, len);




//			int total = 0;
//			for (int j = 0; j < ii.split("\n").length; j++) {
//				String jj = ii.split("\n")[j];
//				total += Integer.parseInt(jj);
//			}
//			totals.add(total);
		}
		System.out.println(total);

	}
}
