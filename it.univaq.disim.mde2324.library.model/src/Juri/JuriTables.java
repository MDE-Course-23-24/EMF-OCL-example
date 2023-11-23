/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /it.univaq.disim.mde2324.library.model/model/Juri.ecore
 * using:
 *   /it.univaq.disim.mde2324.library.model/model/Juri.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package Juri;

// import Juri.JuriPackage;
// import Juri.JuriTables;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.pivot.TemplateParameters;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.DataTypeId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.TypeUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * JuriTables provides the dispatch tables for the Juri for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class JuriTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(JuriPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_jj = IdManager.getNsURIPackageId("http://www.eclipse.org/jj", null, JuriPackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_Book = JuriTables.PACKid_http_c_s_s_www_eclipse_org_s_jj.getClassId("Book", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Library = JuriTables.PACKid_http_c_s_s_www_eclipse_org_s_jj.getClassId("Library", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Loan = JuriTables.PACKid_http_c_s_s_www_eclipse_org_s_jj.getClassId("Loan", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Member = JuriTables.PACKid_http_c_s_s_www_eclipse_org_s_jj.getClassId("Member", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EDate = JuriTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EDate", 0);
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ IntegerValue INT_2 = ValueUtil.integerValueOf("2");
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Book = TypeId.BAG.getSpecializedId(JuriTables.CLSSid_Book, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Book_0 = TypeId.BAG.getSpecializedId(JuriTables.CLSSid_Book, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Loan = TypeId.BAG.getSpecializedId(JuriTables.CLSSid_Loan, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Member = TypeId.BAG.getSpecializedId(JuriTables.CLSSid_Member, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Loan = TypeId.ORDERED_SET.getSpecializedId(JuriTables.CLSSid_Loan, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Book = TypeId.SET.getSpecializedId(JuriTables.CLSSid_Book, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Loan = TypeId.SET.getSpecializedId(JuriTables.CLSSid_Loan, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Member = TypeId.SET.getSpecializedId(JuriTables.CLSSid_Member, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			JuriTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of JuriTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _Book = new EcoreExecutorType(JuriPackage.Literals.BOOK, PACKAGE, 0);
		public static final EcoreExecutorType _Library = new EcoreExecutorType(JuriPackage.Literals.LIBRARY, PACKAGE, 0);
		public static final EcoreExecutorType _Loan = new EcoreExecutorType(JuriPackage.Literals.LOAN, PACKAGE, 0);
		public static final EcoreExecutorType _Member = new EcoreExecutorType(JuriPackage.Literals.MEMBER, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_Book,
			_Library,
			_Loan,
			_Member
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of JuriTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _Book__Book = new ExecutorFragment(Types._Book, JuriTables.Types._Book);
		private static final ExecutorFragment _Book__OclAny = new ExecutorFragment(Types._Book, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Book__OclElement = new ExecutorFragment(Types._Book, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Library__Library = new ExecutorFragment(Types._Library, JuriTables.Types._Library);
		private static final ExecutorFragment _Library__OclAny = new ExecutorFragment(Types._Library, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Library__OclElement = new ExecutorFragment(Types._Library, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Loan__Loan = new ExecutorFragment(Types._Loan, JuriTables.Types._Loan);
		private static final ExecutorFragment _Loan__OclAny = new ExecutorFragment(Types._Loan, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Loan__OclElement = new ExecutorFragment(Types._Loan, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Member__Member = new ExecutorFragment(Types._Member, JuriTables.Types._Member);
		private static final ExecutorFragment _Member__OclAny = new ExecutorFragment(Types._Member, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Member__OclElement = new ExecutorFragment(Types._Member, OCLstdlibTables.Types._OclElement);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of JuriTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of JuriTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		public static final ExecutorOperation _Book__isAvailable = new ExecutorOperation("isAvailable", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Book,
			0, TemplateParameters.EMPTY_LIST, null);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of JuriTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final ExecutorProperty _Book__copies = new EcoreExecutorProperty(JuriPackage.Literals.BOOK__COPIES, Types._Book, 0);
		public static final ExecutorProperty _Book__library = new EcoreExecutorProperty(JuriPackage.Literals.BOOK__LIBRARY, Types._Book, 1);
		public static final ExecutorProperty _Book__loans = new EcoreExecutorProperty(JuriPackage.Literals.BOOK__LOANS, Types._Book, 2);
		public static final ExecutorProperty _Book__name = new EcoreExecutorProperty(JuriPackage.Literals.BOOK__NAME, Types._Book, 3);
		public static final ExecutorProperty _Book__Loan__book = new ExecutorPropertyWithImplementation("Loan", Types._Book, 4, new EcoreLibraryOppositeProperty(JuriPackage.Literals.LOAN__BOOK));
		public static final ExecutorProperty _Book__Member__books = new ExecutorPropertyWithImplementation("Member", Types._Book, 5, new EcoreLibraryOppositeProperty(JuriPackage.Literals.MEMBER__BOOKS));

		public static final ExecutorProperty _Library__books = new EcoreExecutorProperty(JuriPackage.Literals.LIBRARY__BOOKS, Types._Library, 0);
		public static final ExecutorProperty _Library__loans = new EcoreExecutorProperty(JuriPackage.Literals.LIBRARY__LOANS, Types._Library, 1);
		public static final ExecutorProperty _Library__members = new EcoreExecutorProperty(JuriPackage.Literals.LIBRARY__MEMBERS, Types._Library, 2);
		public static final ExecutorProperty _Library__name = new EcoreExecutorProperty(JuriPackage.Literals.LIBRARY__NAME, Types._Library, 3);

		public static final ExecutorProperty _Loan__book = new EcoreExecutorProperty(JuriPackage.Literals.LOAN__BOOK, Types._Loan, 0);
		public static final ExecutorProperty _Loan__date = new EcoreExecutorProperty(JuriPackage.Literals.LOAN__DATE, Types._Loan, 1);
		public static final ExecutorProperty _Loan__member = new EcoreExecutorProperty(JuriPackage.Literals.LOAN__MEMBER, Types._Loan, 2);
		public static final ExecutorProperty _Loan__Book__loans = new ExecutorPropertyWithImplementation("Book", Types._Loan, 3, new EcoreLibraryOppositeProperty(JuriPackage.Literals.BOOK__LOANS));
		public static final ExecutorProperty _Loan__Library__loans = new ExecutorPropertyWithImplementation("Library", Types._Loan, 4, new EcoreLibraryOppositeProperty(JuriPackage.Literals.LIBRARY__LOANS));
		public static final ExecutorProperty _Loan__Member__loans = new ExecutorPropertyWithImplementation("Member", Types._Loan, 5, new EcoreLibraryOppositeProperty(JuriPackage.Literals.MEMBER__LOANS));

		public static final ExecutorProperty _Member__books = new EcoreExecutorProperty(JuriPackage.Literals.MEMBER__BOOKS, Types._Member, 0);
		public static final ExecutorProperty _Member__library = new EcoreExecutorProperty(JuriPackage.Literals.MEMBER__LIBRARY, Types._Member, 1);
		public static final ExecutorProperty _Member__loan = new EcoreExecutorProperty(JuriPackage.Literals.MEMBER__LOAN, Types._Member, 2);
		public static final ExecutorProperty _Member__loans = new EcoreExecutorProperty(JuriPackage.Literals.MEMBER__LOANS, Types._Member, 3);
		public static final ExecutorProperty _Member__name = new EcoreExecutorProperty(JuriPackage.Literals.MEMBER__NAME, Types._Member, 4);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of JuriTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _Book =
			{
				Fragments._Book__OclAny /* 0 */,
				Fragments._Book__OclElement /* 1 */,
				Fragments._Book__Book /* 2 */
			};
		private static final int /*@NonNull*/ [] __Book = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Library =
			{
				Fragments._Library__OclAny /* 0 */,
				Fragments._Library__OclElement /* 1 */,
				Fragments._Library__Library /* 2 */
			};
		private static final int /*@NonNull*/ [] __Library = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Loan =
			{
				Fragments._Loan__OclAny /* 0 */,
				Fragments._Loan__OclElement /* 1 */,
				Fragments._Loan__Loan /* 2 */
			};
		private static final int /*@NonNull*/ [] __Loan = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Member =
			{
				Fragments._Member__OclAny /* 0 */,
				Fragments._Member__OclElement /* 1 */,
				Fragments._Member__Member /* 2 */
			};
		private static final int /*@NonNull*/ [] __Member = { 1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Book.initFragments(_Book, __Book);
			Types._Library.initFragments(_Library, __Library);
			Types._Loan.initFragments(_Loan, __Loan);
			Types._Member.initFragments(_Member, __Member);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of JuriTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _Book__Book = {
			JuriTables.Operations._Book__isAvailable /* isAvailable() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Book__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Book__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Library__Library = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Library__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Library__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Loan__Loan = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Loan__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Loan__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Member__Member = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Member__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Member__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Book__Book.initOperations(_Book__Book);
			Fragments._Book__OclAny.initOperations(_Book__OclAny);
			Fragments._Book__OclElement.initOperations(_Book__OclElement);

			Fragments._Library__Library.initOperations(_Library__Library);
			Fragments._Library__OclAny.initOperations(_Library__OclAny);
			Fragments._Library__OclElement.initOperations(_Library__OclElement);

			Fragments._Loan__Loan.initOperations(_Loan__Loan);
			Fragments._Loan__OclAny.initOperations(_Loan__OclAny);
			Fragments._Loan__OclElement.initOperations(_Loan__OclElement);

			Fragments._Member__Member.initOperations(_Member__Member);
			Fragments._Member__OclAny.initOperations(_Member__OclAny);
			Fragments._Member__OclElement.initOperations(_Member__OclElement);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of JuriTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _Book = {
			JuriTables.Properties._Book__copies,
			JuriTables.Properties._Book__library,
			JuriTables.Properties._Book__loans,
			JuriTables.Properties._Book__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Library = {
			JuriTables.Properties._Library__books,
			JuriTables.Properties._Library__loans,
			JuriTables.Properties._Library__members,
			JuriTables.Properties._Library__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Loan = {
			JuriTables.Properties._Loan__book,
			JuriTables.Properties._Loan__date,
			JuriTables.Properties._Loan__member,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Member = {
			JuriTables.Properties._Member__books,
			JuriTables.Properties._Member__library,
			JuriTables.Properties._Member__loan,
			JuriTables.Properties._Member__loans,
			JuriTables.Properties._Member__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Book__Book.initProperties(_Book);
			Fragments._Library__Library.initProperties(_Library);
			Fragments._Loan__Loan.initProperties(_Loan);
			Fragments._Member__Member.initProperties(_Member);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of JuriTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of JuriTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new JuriTables();
	}

	private JuriTables() {
		super(JuriPackage.eNS_URI);
	}
}
